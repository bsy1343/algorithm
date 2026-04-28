# [Silver V] Patchwork - 24931

[문제 링크](https://www.acmicpc.net/problem/24931)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 52, 정답: 44, 맞힌 사람: 33, 정답 비율: 84.615%

### 분류

구현, 문자열

### 문제 설명

<p>Adam&rsquo;s grandmother has a birthday coming up and he wants to make her a beautiful patchwork quilt as a present. He has created a collection of patch designs that he will sew onto the quilt. However, he is having trouble deciding exactly where to place his patches. His current procedure is to sew on all patches in a given configuration, determine if he likes the way it looks, and cut them all off if he doesn&rsquo;t. This is highly inefficient and Adam is running out of time.</p>

<p>Adam starts with a rectangular white cloth to be used as the base for his quilt and has a collection of possible patch types. Each patch type is a rectangular piece of cloth with a specified design. Fortunately, Adam has come prepared and he has an unlimited quantity of every patch type. Adam has asked you to write a program to determine what the cloth will look like after sewing the patches on in a specific order and in specific locations. Note that Adam cuts off excess fabric that hangs off the edge of the quilt&rsquo;s base so your program should do the same.</p>

<p>Help Adam by writing a program to output the completed quilt.</p>

### 입력

<p>The first line of input consists of two integers&nbsp;$R,C$&nbsp;($1&le;R,C&le;100$) giving the dimensions of the quilt. Initially, this quilt is white and is represented by a grid with $R$&nbsp;rows and&nbsp;$C$&nbsp;columns where each entry is the character &lsquo;<code>.</code>&rsquo; (a period) representing white.</p>

<p>The second line contains a single integer&nbsp;$N$&nbsp;($1&le;N&le;100$), which is the number of different patch types. The following describes the patches:</p>

<ul>
	<li>The first line in the description of the $i$th patch type consists of two integers&nbsp;$r_i,c_i$&nbsp;($1&le;r_i,c_i&le;100$) giving the number of rows&nbsp;$r_i$&nbsp;and columns&nbsp;$c_i$&nbsp;in this patch.</li>
	<li>Then&nbsp;$r_i$&nbsp;lines follow, each containing&nbsp;$c_i$&nbsp;non-whitespace ASCII characters which describes the&nbsp;$i$th patch type.</li>
</ul>

<p>The next line contains a single integer&nbsp;$M$&nbsp;($1&le;M&le;100$), which is the number of patches that Adam wishes to sew onto the quilt.</p>

<p>The next&nbsp;$M$&nbsp;lines of input describe the placement and types of these patches. The&nbsp;$j$th such line contains three integers&nbsp;$q_j$&nbsp;($1&le;q_j&le;R$),&nbsp;$t_j$&nbsp;($1&le;t_j&le;C$), and&nbsp;$p_j$&nbsp;($1&le;p_j&le;N$). This means that the&nbsp;$p_j$th patch is sewn onto the quilt with its top-left corner on the&nbsp;$q_j,t_j$&nbsp;row/column position of the quilt. This list is given in the order that they are sewn onto the quilt.</p>

### 출력

<p>Display the completed quilt. That is, display&nbsp;$R$ rows and&nbsp;$C$&nbsp;columns of ASCII characters where each position is the pattern of the quilt after sewing on the given patches whilst removing excess fabric.</p>