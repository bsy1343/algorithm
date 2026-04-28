# [Platinum I] Regional development - 25110

[문제 링크](https://www.acmicpc.net/problem/25110)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 256 MB

### 통계

제출: 38, 정답: 21, 맞힌 사람: 15, 정답 비율: 60.000%

### 분류

그래프 이론, 그래프 탐색, 최대 유량

### 문제 설명

<p>The King has received several complaints that certain regions of his kingdom are economically neglected. The citizens have not seen a single merchant travelling on certain roads between villages in a very long time. To fix this problem and return wealth and prosperity to his kingdom, the King has appointed his royal mathematician to come up with a viable plan of merchant&rsquo;s routes.</p>

<p>The plan will consist of a positive number of merchants travelling along each road in one of the directions. The number of merchants entering a village along the roads should be equal to the number of merchants exiting it. To ensure a somewhat even distribution of merchants throughout the kingdom, the King has requested that the number of merchants travelling along each road should be at least one and less than $M$.</p>

<p>The royal mathematician has been summoned by the King to present his findings. His future is uncertain as he has not been able to solve the problem. However, he did make some progress. He found a plan with a valid number of merchants travelling along each road. The only problem is that the incoming and outgoing merchants in the villages do not add up (at least not exactly). Their difference might not be zero for every village, but it is equal to zero modulo $M$. He is willing to share his findings with you, if you can write a program that finds a valid plan or reports that it doesn&rsquo;t exist.</p>

### 입력

<p>The first line contains $N$, the number of villages, $R$, the number of roads and the number $M$.</p>

<p>The following $R$ lines describe the roads with numbers $A_i$, $B_i$ and $C_i$ that indicate a road between villages $A_i$ and $B_i$ with $C_i$ merchants travelling from $A_i$ to $B_i$. Cities are numbered from $1$ to $N$. There is at most one road between each pair of villages and no road connects a village with itself. The difference between incoming and outgoing merchants in each village is equal to $0$ modulo $M$.</p>

### 출력

<p>Print the number of merchants travelling along each road. Print them in the same order as they were given in the input and on separate lines. If the merchants travel in the opposite direction with respect to the order of cities that defined a road in the input, indicate this with a negative value (e.g. if there are $X$ merchants travelling from $B_i$ to $A_i$, indicate this with $-X$ in the $i$-th line of output).</p>

<p>If there are multiple solutions, you can output any of them. If no solution exists, print the word &quot;<code>IMPOSSIBLE</code>&quot; in a single line (without the quotes).</p>

### 제한

<ul>
	<li>$1 &le; N &le; 1000$</li>
	<li>$0 &le; R &le; 10\,000$</li>
	<li>$2 &le; M &le; 1000$</li>
	<li>$1 &le; A_i , B_i &le; N$</li>
	<li>$0 &lt; C_i &lt; M$</li>
</ul>