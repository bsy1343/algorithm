# [Silver IV] Proofs - 20732

[문제 링크](https://www.acmicpc.net/problem/20732)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 81, 정답: 59, 맞힌 사람: 40, 정답 비율: 85.106%

### 분류

구현, 자료 구조, 문자열, 집합과 맵, 해시를 사용한 집합과 맵, 파싱

### 문제 설명

<p>You are teaching discrete math. You have done your best to teach your students about axioms and inference rules, proofs and theorems. Sometimes the students write beautiful proofs that Fermat would be proud of but sometimes, also like Fermat, their proofs are not quite right. You are getting a little tired of hunting through some of these so-called &quot;proofs&quot; for the magic tricks that let them prove $1 = 2$ and had the great idea to write a computer program to speed things up!</p>

<p>Because this is the first class in proof-based mathematics, you have started your students off with a simple proof system. All proof lines consist of a list of assumptions, an arrow, and a conclusion. If there are no assumptions, the conclusion is an axiom. A line of the proof is valid if and only if all assumptions were conclusions of previous lines. Sometimes the students derive a conclusion more than once just to be extra sure it is true, and that is perfectly all right!</p>

### 입력

<p>The first line of input consists of an integer $1 \le n \le 400\,000$, the number of lines in the &quot;proof&quot;. Then follow the $n$ lines of the &quot;proof&quot;. Each line has $0 \le a \le 5$ assumptions, followed by an arrow (the string &quot;<code>-&gt;</code>&quot;), followed by one conclusion. All assumptions and conclusions consist of $1 \le c \le 5$ uppercase alphabetic characters. The assumptions, arrow, and conclusion are all separated by single spaces.</p>

### 출력

<p>If every line is correct output &quot;<code>correct</code>&quot;. &nbsp;Otherwise, output the number of the first line with an error (line numbers start at $1$).</p>