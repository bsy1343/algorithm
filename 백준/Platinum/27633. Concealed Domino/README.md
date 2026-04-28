# [Platinum II] Concealed Domino - 27633

[문제 링크](https://www.acmicpc.net/problem/27633)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 48, 정답: 9, 맞힌 사람: 8, 정답 비율: 22.222%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>There are N dominoes. Each domino is an ordered-pair of two eyes (a<sub>i</sub>, b<sub>i</sub>) where 1 &le; a<sub>i</sub>, b<sub>i</sub> &le; M. That means a domino (p, q) differs from a domino (q, p) if p &ne; q.</p>

<p>Due to some unknown reasons, each domino is either partially or fully concealed. Specifically, at least an eye is concealed from each domino.</p>

<p>Your task in this problem is to figure out the concealed eyes such that no two dominoes are the same. If it is possible, then you need to output one set of unconcealed dominoes that corresponds to the given input.</p>

<p>For example, let there be N = 3 dominoes with the maximum value of an eye be M = 2 and the dominoes be {(?, ?),(1, ?),(?, 2)}. There are 6 correct answers for this case.</p>

<ul>
	<li>{(1, 1),(1, 2),(2, 2)}</li>
	<li>{(1, 2),(1, 1),(2, 2)}</li>
	<li>{(2, 1),(1, 1),(1, 2)}</li>
	<li>{(2, 1),(1, 1),(2, 2)}</li>
	<li>{(2, 1),(1, 2),(2, 2)}</li>
	<li>{(2, 2),(1, 1),(1, 2)}</li>
</ul>

<p>Note that answers such as {(1, 1),(1, 1),(1, 2)} is not correct as the first and second dominoes are the same. Answer such as {(1, 1),(2, 2),(1, 2)} is also not correct as the second domino (2, 2) does not correspond to the input (1, ?).</p>

### 입력

<p>Input begins with a line containing two integers N M (1 &le; N &le; min(100 000, M<sup>2</sup>); 1 &le; M &le; 100, 000) representing the number of dominoes and the maximum value on each eye. The next N lines each contains two integers a<sub>i</sub> b<sub>i</sub> (a<sub>i</sub>, b<sub>i</sub> &isin; {&minus;1, 1, 2, . . . , M}; a<sub>i</sub> = &minus;1 or b<sub>i</sub> = &minus;1) representing the ordered-pair of eyes of the i<sup>th</sup> domino. If a<sub>i</sub> or b<sub>i</sub> equals to &minus;1, then it means the respective value is unknown.</p>

### 출력

<p>If all concealed eyes can be determined such that no two dominoes are the same, then output starts with &ldquo;YES&rdquo; (without quotes) in a line. The next N lines each contains two integers pi qi representing the ordered-pair of eyes of the i<sup>th</sup> domino. The order of dominoes in the output should be the same as the input. If there is more than one correct answer, you may output any one of them.</p>

<p>If the concealed eyes cannot be determined, then output &ldquo;NO&rdquo; (without quotes) in a line.</p>