# [Silver II] Database - 3542

[문제 링크](https://www.acmicpc.net/problem/3542)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 85, 정답: 46, 맞힌 사람: 34, 정답 비율: 55.738%

### 분류

자료 구조, 문자열, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Peter studies the theory of relational databases. Table in the relational database consists of values that are arranged in rows and columns.</p>

<p>There are different normal forms that database may adhere to. Normal forms are designed to minimize the redundancy of data in the database. For example, a database table for a library might have a row for each book and columns for book name, book author, and author&rsquo;s email.</p>

<p>If the same author wrote several books, then this representation is clearly redundant. To formally define this kind of redundancy Peter has introduced his own normal form. A table is in Peter&rsquo;s Normal Form (PNF) if and only if there is no pair of rows and a pair of columns such that the values in the corresponding columns are the same for both rows.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/3542.%E2%80%85Database/fdcf333a.png" data-original-src="https://www.acmicpc.net/upload/images3/db1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:71px; width:478px" /></p>

<p>The above table is clearly not in PNF, since values for 2rd and 3rd columns repeat in 2nd and 3rd rows. However, if we introduce unique author identifier and split this table into two tables &mdash; one containing book name and author id, and the other containing book id, author name, and author email, then both resulting tables will be in PNF.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/3542.%E2%80%85Database/0b15a0f1.png" data-original-src="https://www.acmicpc.net/upload/images3/db2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:77px; width:583px" /></p>

<p>Given a table your task is to figure out whether it is in PNF or not.</p>

### 입력

<p>The first line of the input file contains two integer numbers n and m (1 &le; n &le; 10 000, 1 &le; m &le; 10), the number of rows and columns in the table. The following n lines contain table rows. Each row has m column values separated by commas. Column values consist of ASCII characters from space (ASCII code 32) to tilde (ASCII code 126) with the exception of comma (ASCII code 44). Values are not empty and have no leading and trailing spaces. Each row has at most 80 characters (including separating commas).</p>

### 출력

<p>If the table is in PNF write to the output file a single word &ldquo;YES&rdquo; (without quotes). If the table is not in PNF, then write three lines. On the first line write a single word &ldquo;NO&rdquo; (without quotes). On the second line write two integer row numbers r<sub>1</sub> and r<sub>2</sub> (1 &le; r<sub>1</sub>, r<sub>2</sub> &le; n, r<sub>1</sub> &ne; r<sub>2</sub>), on the third line write two integer column numbers c<sub>1</sub> and c<sub>2</sub> (1 &le; c<sub>1</sub>, c<sub>2</sub> &le; m, c<sub>1</sub>&nbsp;&ne;&nbsp;c<sub>2</sub>), so that values in columns c<sub>1</sub> and c<sub>2</sub> are the same in rows r<sub>1</sub> and r<sub>2</sub>.</p>