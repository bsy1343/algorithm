# [Platinum IV] Checker-Circle Property - 32883

[문제 링크](https://www.acmicpc.net/problem/32883)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 47, 정답: 13, 맞힌 사람: 12, 정답 비율: 29.268%

### 분류

기하학, 브루트포스 알고리즘, 스위핑

### 문제 설명

<p>You are given a circle centered at $(0,0)$ and a set of points on the circle's circumference. You need to check whether all the points lie on two quarter circles facing each other created by two perpendicular lines passing through the origin (including its bounds). If they do, the set is said to satisfy the <strong>checker-circle property</strong>.</p>

<p>The below illustration is an example set of points that satisfies the checker-circle property.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32883.%E2%80%85Checker-Circle%E2%80%85Property/ebf4dd5f.png" data-original-src="https://boja.mercury.kr/assets/problem/32883-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100%; max-width: 320px;"></p>

<p>Determine whether a set of points $P$ satisfies the checker-circle property.</p>

### 입력

<p>The first line of input contains two space-separated integers: $N$, denoting the number of points in the set, and $R$, denoting the circle's radius. ($1 \le N \le 200\,000;$ $1 \le R \le 10^9$)</p>

<p>The $i$-th of the following $N$ lines of input contains two space-separated integers: $x_i$ and $y_i$, such that $$P_i = R\times \frac{(x_i,y_i)}{\sqrt{x_i^2+y_i^2}}.$$ ($-10^9 \le x_i,y_i \le 10^9;$ $(x_i,y_i) \ne (0,0)$)</p>

<p>Note that the set can contain two or more points with the same position.</p>

### 출력

<p>Output <span style="color:#e74c3c;"><code>Yes</code></span> if the set satisfies the checker-circle property and <span style="color:#e74c3c;"><code>No</code></span> otherwise.</p>

### 힌트

<p>(For Sogang students:) Note that this problem is an improvised version that matches the format of a problem in a general programming contest. While in the exam, the original scoring was:</p>

<ul>
	<li>$40$ points for Subtask 1.</li>
	<li>$55$ points for Subtask 2.</li>
	<li>$5$ points for Subtask 3.</li>
</ul>