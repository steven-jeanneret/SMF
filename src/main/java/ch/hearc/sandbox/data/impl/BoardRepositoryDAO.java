package ch.hearc.sandbox.data.impl;

import ch.hearc.sandbox.data.BoardDAO;
import ch.hearc.sandbox.model.Board;
import ch.hearc.sandbox.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Component
public class BoardRepositoryDAO  implements BoardDAO {
    @Autowired
    private BoardRepository brepo;


    @Override
    public List<Board> findAll() {
        List<Board> boards = new ArrayList<>();
        brepo.findAll().forEach(boards::add);
        return boards;
    }

    @Override
    public Board find(Long id) {
        return brepo.findById(id).orElse(new Board());
    }

    @Override
    public void save(@Valid Board board) {
        brepo.save(board);
    }
}
