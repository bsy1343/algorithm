# [Platinum V] Infection - 31105

[문제 링크](https://www.acmicpc.net/problem/31105)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

수학, 확률론

### 문제 설명

<p>An emergency happened in one secret organization. In the middle of the working day, one of the employees was hospitalized with symptoms of an extremely dangerous <em>colonavirus</em> infection. In this regard, the management of the organization wants to establish which employees can still be infected, but the symptoms of the disease have not yet shown themselves.</p>

<p>There are $n$ employees in the organization, who can be numbered with integers from $1$ to $n$. From the recordings of CCTV cameras, the organization&#39;s management established when which employees contacted each other. In addition, management took into account the following assumptions:</p>

<ul>
	<li>At the beginning of the working day, exactly one of the employees was infected, and each of the initial states could happen with a probability of $1/n$.</li>
	<li>If two employees come into contact with each other, and one of them is infected and the other is not, then a healthy employee becomes infected with a probability of $1/2$. If both employees are healthy, or both are infected, nothing happens.</li>
	<li>If an employee is infected, he cannot suddenly recover, that is, he remains infected until the end.</li>
	<li>It is known that the employee numbered $k$ was eventually infected.</li>
</ul>

<p>A chronological list of employees&#39; contacts is given. Determine for each employee the probability of being infected according to the assumptions described above.</p>

### 입력

<p>The first line contains three integers $n$, $k$ and $m$ --- the number of employees, the number of the infected employee and the number of contacts, respectively ($2 \le n \le 15$, $1 \le k \le n$, $1 \le m \le 50$).</p>

<p>The $i$-th of the following $m$ lines contains two integers $x_i$ and $y_i$ --- indexes of employees who participated in the $i$-th contact ($1 \le x_i, y_i \le n$, $x_i \ne y_i$).</p>

<p>All contacts in the list are given in chronological order</p>

### 출력

<p>Print $n$ lines. On the $i$-th line print the probability of infection of the $i$-th employee as an irreducible fraction $a/b$. See the example for a more precise understanding.</p>