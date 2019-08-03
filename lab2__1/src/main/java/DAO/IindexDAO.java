package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import BEAN.ThueBao;

public interface IindexDAO {
    List<ThueBao> findAll(String name);
}
