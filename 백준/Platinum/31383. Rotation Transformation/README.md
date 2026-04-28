# [Platinum V] Rotation Transformation - 31383

[문제 링크](https://www.acmicpc.net/problem/31383)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 42, 정답: 14, 맞힌 사람: 12, 정답 비율: 38.710%

### 분류

수학, 기하학, 선형대수학, 3차원 기하학

### 문제 설명

<blockquote>
<p>A simple motion over and over...</p>

<hr />
<p>t.A.T.u., &lt;&lt;A Simple Motion&gt;&gt;</p>
</blockquote>

<p>Julia loves simple motions very much especially in three-dimensional space! Recently she found a matrix that corresponds with some rotation around an axis that goes through the origin. Rotation is defined by unit vector $v = \begin{pmatrix} v_x \\ v_y \\ v_z \end{pmatrix}$ and rotation angle $\alpha$.</p>

<p>Suppose you look at the origin from the end of $v$ then if rotation is going counter-clockwise then $\alpha$ will be positive, negative overwise.</p>

<p>Rotation matrix moves point $\begin{pmatrix} x \\ y \\ z \end{pmatrix}$ to $\begin{pmatrix} x&#39; \\ y&#39; \\ z&#39; \end{pmatrix}$ like this: $$ \begin{pmatrix} x&#39; \\ y&#39; \\ z&#39; \end{pmatrix} = \begin{pmatrix} A_{11} &amp; A_{12} &amp; A_{13} \\ A_{21} &amp; A_{22} &amp; A_{23} \\ A_{31} &amp; A_{32} &amp; A_{33} \\ \end{pmatrix} \times \begin{pmatrix} x \\ y \\ z \end{pmatrix}. $$</p>

<p>Unfortunately Julia doesn&#39;t know values of $v$ and $\alpha$, so she asked you to restore them and then she will continue her simple motion.</p>

### 입력

<p>You are given matrix $A$. It is guaranteed that there is such rotation matrix $A&#39;$ that $|A&#39;_{ij} - A_{ij}| &lt; 10^{-13}$.</p>

### 출력

<p>First line should contain $\alpha$ in degrees. Second line should contain coordinates of unit vector $v$. It is guaranteed that $1 \le |\alpha| \le 179$. Output all number as precise as you can. Your answer will be considered correct if the difference between $A_{ij}$ and the matrix constructed from your angle and unit vector will not exceed $10^{-6}$.</p>