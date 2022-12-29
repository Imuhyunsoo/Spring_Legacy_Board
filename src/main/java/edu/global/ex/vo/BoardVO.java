package edu.global.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO {

    private int bid;
    private String bname;
    private String btitle;
    private String bcontent;
    private Timestamp bdate;
    private int bhit;
    private int bgroup;
    private int bstep;
    private int bindent;

}
