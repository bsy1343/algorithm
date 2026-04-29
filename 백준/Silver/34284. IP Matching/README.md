# [Silver III] IP Matching - 34284

[문제 링크](https://www.acmicpc.net/problem/34284)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 23, 정답: 20, 맞힌 사람: 19, 정답 비율: 86.364%

### 분류

구현, 문자열, 브루트포스 알고리즘, 비트마스킹, 파싱

### 문제 설명

<p>Jayden is taking Computer Networks this semester and is currently learning about routers and IP address forwarding. His homework asks him to implement a technique called longest prefix matching to determine which entry in a router's lookup table corresponds to a given IP address. However, he is struggling and needs your help!</p>

<p>The router lookup table consists of $n$ entries, each consisting of a standard IP address and a subnet mask. For example, an entry could be:</p>

<p style="text-align: center;">$192.168.1.0/24$</p>

<p>In this example, $192.168.1.0$ is the IP address and $24$ is the mask. The <em>binary representation</em> of an IP address can be found by converting the four decimal numbers in the address to binary (base $2$) and adding zeros to the left until the result is $8$ digits long. For example, the above address would have the following binary representation:</p>

<p style="text-align: center;">$11000000$.$10101000$.$00000001$.$00000000$/$24$</p>

<p>The mask is the number of bits starting from the left that we need to match. In this example, all of the bits after the 24th bit are not important and will always be $0$, so we can ignore them:</p>

<p style="text-align: center;">$11000000$.$10101000$.$00000001$.********</p>

<p>Now, to check an IP address against this entry, we just check if the first 24 bits match. If they match, this would result in a matching of length 24. When we check an IP address against the lookup table, we are looking for the index of the entry that provides the longest matching. Consider the table from sample input 1:</p>

<table class="table table-bordered table-width-inherit">
	<tbody>
		<tr>
			<th>Index</th>
			<th>Address</th>
		</tr>
		<tr>
			<td>1</td>
			<td>$11000000$.$10101000$.$00000001$.********</td>
		</tr>
		<tr>
			<td>2</td>
			<td>$11000000$.$10101000$.$0011$****.********</td>
		</tr>
		<tr>
			<td>3</td>
			<td>$11000000$.$10101000$.$00000001$.$1001$****</td>
		</tr>
	</tbody>
</table>

<p>The first address we have to match is $192.168.1.148$ ($11000000$.$10101000$.$00000001$.$10010100$).</p>

<ul>
	<li>The first entry matches with a length of 24, since the 24 bits not ignored are the same as the given address.</li>
	<li>The second entry does not match; the bits in the third group ($0011$****) are not the same as the given address.</li>
	<li>The third entry matches with a length of 28, since the 28 bits not ignored are the same as the given address.</li>
</ul>

<p>Both row 1 and row 3 match. However, we print $3$ because row 3 has the <em>longest</em> match (length 28).</p>

<p>If an address does not match any entries in the lookup table, print $-1$.</p>

### 입력

<p>The first line of input contains two integers $n,m$ ($1 \leq n, m \leq 10^{3}$)---the number of entries in the lookup table and the number of IP addresses to match, respectively.</p>

<p>The next $n$ lines of input represent an entry in the lookup table, and will be of the format $a.b.c.d/e$ ($0 \leq a,b,c,d \leq 255, 0 \leq e \leq 32$). It is guaranteed that no two entries in the lookup table will match the same set of IP addresses.</p>

<p>The next $m$ lines of input represent an IP address to match. Each address will be of the format $a.b.c.d$ ($0 \leq a,b,c,d \leq 255$).</p>

### 출력

<p>For each of the $m$ IP addresses to match, print the index of the longest prefix matching in the lookup table, or print $-1$ if it does not match anything in the lookup table.</p>