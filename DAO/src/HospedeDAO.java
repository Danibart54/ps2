package dao;

import model.Hospede;
import util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HospedeDAO {

    // Inserir novo hóspede
    public void inserir(Hospede h) {
        String sql = "INSERT INTO hospede (nome, telefone) VALUES (?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, h.getNome());
            stmt.setString(2, h.getTelefone());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Atualizar dados do hóspede
    public void atualizar(Hospede h) {
        String sql = "UPDATE hospede SET nome=?, telefone=? WHERE id=?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, h.getNome());
            stmt.setString(2, h.getTelefone());
            stmt.setInt(3, h.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Listar todos os hóspedes
    public List<Hospede> listar() {
        List<Hospede> lista = new ArrayList<>();
        String sql = "SELECT * FROM hospede";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Hospede h = new Hospede();
                h.setId(rs.getInt("id"));
                h.setNome(rs.getString("nome"));
                h.setTelefone(rs.getString("telefone"));
                lista.add(h);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    // Remover hóspede
    public void remover(int id) {
        String sql = "DELETE FROM hospede WHERE id=?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
