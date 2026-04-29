# [Silver IV] Generating Cool Passwords Company - 35090

[문제 링크](https://www.acmicpc.net/problem/35090)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 65, 정답: 42, 맞힌 사람: 32, 정답 비율: 59.259%

### 분류

무작위화, 문자열

### 문제 설명

<p>You have been tasked with creating a list of very secure passwords to be distributed to the users at the <em>Generating Cool Passwords Company</em>. Therefore, given an integer $n$, generate exactly $n$ passwords which each satisfy the following criteria:</p>

<ul>
<li>Each password consists of at least $8$ and at most $12$ printable ASCII characters with code between $33$ (<code>!</code>) and $126$ (<code> </code>) inclusive. See Figure G.1 for an overview of these.</li>
<li>Each password contains at least one lowercase letter <code>a</code>-<code>z</code>, at least one uppercase letter <code>A</code>-<code>Z</code>, at least one digit <code>0</code>-<code>9</code> and at least one special symbol (any character that is neither a digit nor a lowercase or uppercase letter).</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/35090.%E2%80%85Generating%E2%80%85Cool%E2%80%85Passwords%E2%80%85Company/c680d6a7.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35090-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 600px; height: 251px;"></p>

<p style="text-align: center;">Figure G.1: All the non-whitespace printable ASCII characters. The four relevant character classes are highlighted in different colours.</p>

<p>Of course, the passwords should not be too similar to each other. Specifically, for every pair of passwords from your list it must be true that they are distinct and that moreover it is not possible to get one from the other by inserting, modifying or deleting a single character. Formally, the edit distance of any two passwords must be at least $2$.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with an integer $n$ ($1 \le n \le 1000$), the number of passwords to create.</li>
</ul>

### 출력

<p>Output $n$ lines, each with one password according to the rules above. The passwords must have pairwise edit distance at least $2$. If there is more than one solution, any one of them will be accepted.</p>