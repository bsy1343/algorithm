# [Silver IV] Barsik - 20751

[문제 링크](https://www.acmicpc.net/problem/20751)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 173, 정답: 78, 맞힌 사람: 70, 정답 비율: 48.611%

### 분류

수학, 구현, 애드 혹, 많은 조건 분기

### 문제 설명

<p>In one of the corners of a $N$ $\times$ $M$-sized rectangular field, in a cell with the coordinates ($1$, $1$), sits a hungry cat named Barsik. Barsik&#39;s bowl is in the opposite corner of the field, in the cell with the coordinates ($N$, $M$). Barsik can traverse the field by moving between cells adjacent by side.</p>

<p>However, there is an obstacle, a vicious dog named Tuzik, who sits in a kennel with the coordinates ($R$, $C$). Tuzik is chained to the kennel and thus can only reach cells that are within $S$ moves from the kennel (each move going to a cell adjacent by side). All such cells are filled with bones of dead barsiks, and our Barsik cannot make himself walk through them.</p>

<p>Barsik desperately needs to know if he can reach his bowl without stepping into Tuzik&#39;s area.</p>

### 입력

<p>The first line of the input file contains an integer $T$ --- the number of tests in the problem ($1 \le T \le 2\,000$).</p>

<p>The following $T$ lines contain descriptions of tests, one per line.</p>

<p>Each tests consists of five space-separated integers $N$, $M$, $R$, $C$, and $S$ ($1 \le R \le N \le 10^9$, $1 \le C \le M \le 10^9$, $1 \le S \le 10^9$).</p>

<p>It is guaranteed that the cell with Tuzik&#39;s kennel is placed in such a manner that he cannot reach neither the cell with the original position of Barsik nor the cell with Barsik&#39;s food.</p>

### 출력

<p>For each test, print an answer in a separate line. Print <code>Barsik</code>, if Barsik can reach the food without stepping over bones. Otherwise print <code>Tuzik</code>.</p>

### 힌트

<p>Illustration for the first test from the sample:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/4663b75c-c88b-4a14-99e7-84cc52d74ccc/-/preview/" style="width: 399px; height: 200px;" /></p>