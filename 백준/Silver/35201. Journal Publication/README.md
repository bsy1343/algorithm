# [Silver IV] Journal Publication - 35201

[문제 링크](https://www.acmicpc.net/problem/35201)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 32, 정답: 24, 맞힌 사람: 17, 정답 비율: 70.833%

### 분류

그리디 알고리즘, 문자열, 정렬

### 문제 설명

<p>Both winning BAPC and publishing research papers is a team effort. And every member of the team wants to be appreciated.</p>

<p>Every research paper has a list of authors at the top. Each author is listed using their full name, which might consist of several parts.</p>

<p>To avoid arguments about the order of names, your team decided to just order the list of names in the following way:</p>

<ol>
<li>Pick a single name part for each author.</li>
<li>Sort authors in non-descending order, comparing only the selected parts lexicographically.</li>
</ol>

<p>However, your team already submitted the draft for your paper before you came up with this idea.</p>

<p>You are given the list of author as presented in the draft. Is it possible to pick name parts in a way that the list of authors in the draft is sorted?</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with an integer $n$ ($1\leq n\leq 10^5$), the number of authors.</li>
<li>$n$ lines (one for each author name), each with an integer $p$ ($1\leq p\leq 10$), the number of name parts, followed by $p$ name parts.</li>
</ul>

<p>Each name part has at most $10$ characters and consists of one English uppercase letter (<code>A-Z</code>), followed by only English lowercase letters (<code>a-z</code>).</p>

### 출력

<p>If it is possible to select a name part for each author such that the list is sorted, output for each author the selected name part. Otherwise, output "<code>impossible</code>".</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>