package ch.hearc.sandbox.data;

import ch.hearc.sandbox.model.Board;

import javax.validation.Valid;
import java.util.List;

public interface BoardDAO {
    List<Board> findAll();
    void save(@Valid Board board);
}