# [Platinum IV] Defense Distance - 35021

[문제 링크](https://www.acmicpc.net/problem/35021)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 8, 정답: 7, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

수학, 해 구성하기

### 문제 설명

<p>The NWRRC security server has a final access check for teams that try to submit their solutions to the secret hidden problem.</p>

<p>To pass the check, the team must enter three passwords $s$, $t$, and $u$ that the system will accept. Each password must be a non-empty string consisting of at most $5000$ lowercase English letters.</p>

<p>The rules of the server are public:</p>

<ul>
<li>The distance between $s$ and $t$ should be equal to $a$.</li>
<li>The distance between $s$ and $u$ should be equal to $b$.</li>
<li>The distance between $t$ and $u$ should be equal to $c$.</li>
</ul>

<p>The <em>distance</em> between two strings $s_1$ and $s_2$ is the minimum number of single-character operations (insert one character, remove one character, or replace one character) needed to convert string $s_1$ into string $s_2$. This metric is also known as the Levenshtein distance.</p>

<p>The server gives access to the hidden problem if and only if all described conditions are satisfied. Your goal is to construct a triple of passwords to unlock the hidden problem or determine that it is impossible.</p>

### 입력

<p>The only line contains three integers $a$, $b$, and $c$, denoting the required distances between each pair of passwords ($0 \le a, b, c \le 1000$).</p>

### 출력

<p>If there are no three passwords with the required properties, print "<code>No</code>" in the only line.</p>

<p>Otherwise, print "<code>Yes</code>" in the first line. Then print passwords $s$, $t$, and $u$ in the following three lines. Each password should consist of at least $1$ and at most $5000$ lowercase English letters.</p>

<p>If there are multiple triples of passwords that meet the requirements, print any of them.</p>

### 힌트

<p>In the first test case:</p>

<ul>
<li>The distance between "<code>icpc</code>" and "<code>nwrrc</code>" is $4$: "<code>icpc</code>" $\to$ "<code>irpc</code>" $\to$ "<code>irrc</code>" $\to$ "<code>nrrc</code>" $\to$ "<code>nwrrc</code>".</li>
<li>The distance between "<code>icpc</code>" and "<code>itmo</code>" is $3$: "<code>icpc</code>" $\to$ "<code>itpc</code>" $\to$ "<code>itpo</code>" $\to$ "<code>itmo</code>".</li>
<li>The distance between "<code>nwrrc</code>" and "<code>itmo</code>" is $5$: "<code>nwrrc</code>" $\to$ "<code>wrrc</code>" $\to$ "<code>wrro</code>" $\to$ "<code>irro</code>" $\to$ "<code>itro</code>" $\to$ "<code>itmo</code>".</li>
</ul>

<p>In the second test case, the distance between each pair of passwords is $2$.</p>

<p>In the third test case, it can be shown that there are no three passwords with the required properties.</p>