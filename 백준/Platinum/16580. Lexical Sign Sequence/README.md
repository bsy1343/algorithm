# [Platinum II] Lexical Sign Sequence - 16580

[문제 링크](https://www.acmicpc.net/problem/16580)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 118, 정답: 54, 맞힌 사람: 49, 정답 비율: 49.495%

### 분류

자료 구조, 그리디 알고리즘, 세그먼트 트리, 우선순위 큐

### 문제 설명

<p>Andi likes numbers and sequences, especially, sign sequences. A sign sequence is a sequence which consists of &minus;1 and 1. Andi is a curious person, thus, he wants to build a sign sequence which length is N (the positions are numbered from 1 to N, inclusive).</p>

<p>However, Andi also likes some challenges. Therefore, he prefilled some positions in the sequence with &minus;1 or 1 (the number in these positions cannot be changed). Andi also wants the sequence to fulfill K constraints. For each constraint, there are 3 numbers: A<sub>i</sub>, B<sub>i</sub>, and C<sub>i</sub>. This means that the sum of numbers which position is in the range [A<sub>i</sub>, B<sub>i</sub>] (inclusive) must be at least C<sub>i</sub>.</p>

<p>Sounds confusing, right? It is not done yet. Since there can be many sequences that fulfill all the criteria above, Andi wants the sequence to be lexicographically smallest. Sequence X is lexicographically smaller than sequence Y if and only if there exists a position i where X<sub>i</sub> &lt; Y<sub>i</sub> and X<sub>j</sub> = Y<sub>j</sub> for all j &lt; i.</p>

<p>Find the sequence Andi wants.</p>

### 입력

<p>Input begins with a line containing two integers: N K (1 &le; N &le; 100000; 0 &le; K &le; 100000) representing the length of the sequence and the number of constraints, respectively. The second line contains N integers: P<sub>i</sub> (&minus;1 &le; P<sub>i</sub> &le; 1). If P<sub>i</sub> = 0, then the i<sup>th</sup> position in the sequence is not prefilled, otherwise the i<sup>th</sup> position in the sequence is prefilled by P<sub>i</sub>. The next K lines, each contains three integers: A<sub>i</sub> B<sub>i</sub> C<sub>i</sub> (1 &le; A<sub>i</sub> &le; B<sub>i</sub> &le; N; &minus;N &le; C<sub>i</sub> &le; N) representing the i<sup>th</sup> constraint.</p>

### 출력

<p>Output contains N integers (each separated by a single space) in a line representing the sequence that Andi wants if there exists such sequence, or &ldquo;Impossible&rdquo; (without quotes) otherwise.</p>