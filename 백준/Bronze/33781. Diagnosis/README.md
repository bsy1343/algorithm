# [Bronze II] Diagnosis - 33781

[문제 링크](https://www.acmicpc.net/problem/33781)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 87, 정답: 78, 맞힌 사람: 56, 정답 비율: 93.333%

### 분류

구현

### 문제 설명

<p>In the PHP (Paradise Hospital of Prague) they cure people with a lot of different diseases. The PHP is dealing with a shortage of medical personal, therefore the director is afraid of doctors getting sloppy. Doctors make a diagnosis based on the knowledge they gained in university. So there is a known list of possible diseases and a known list of possible symptoms a patient can have. A doctor makes a diagnosis of one or multiple diseases. Those diseases have known symptoms that need to match exactly with the symptoms of the patient.</p>

<p>More formally: given a set of diseases $D = \{d_1, d_2, ..., d_n\}$, a set of symptoms $S = \{s_1, s_2, ..., s_m\}$ and a function that represents the knowledge about diseases and their symptoms. $f(d) = S'$ with $S' \subseteq S$ and $d \subseteq D$. When a given $D' \subseteq D$ check whether or not the the condition $S = \bigcup_{d \in D'}f(d)$ is true. When it is print "yes" else print "no".</p>

### 입력

<ul>
	<li>One line with two integers $n$ and $m$, with $1 \leq n \leq 1000$ the number of diseases and $1 \leq m \leq 1000$ the number of symptoms. The patient has all symptoms $s_1$ to $s_m$.</li>
	<li>One line with one integer $k$ followed by $k$ integers: the set of diseases $D'$ the patient has according to the doctor $(D' \subseteq D)$.</li>
	<li>$n$ lines, corresponding to diseases $d_1$ to $d_n$, with an integer $p$ followed by $p$ integers: The symptoms belonging to disease $i$. These symptoms are given in ascending order.</li>
</ul>

### 출력

<p>Print "yes" if the symptoms of the diagnosed diseases exactly match the patient's symptoms. Print "no" otherwise.</p>