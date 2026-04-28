# [Platinum IV] Power Network - 3794

[문제 링크](https://www.acmicpc.net/problem/3794)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 48, 정답: 21, 맞힌 사람: 10, 정답 비율: 33.333%

### 분류

그래프 이론, 문자열, 파싱, 최대 유량

### 문제 설명

<p>A power network consists of nodes (power stations, consumers and dispatchers) connected by power transport lines. A node u may be supplied with an amount s(u)&ge;0 of power, may produce an amount 0 &le; p(u) &le; p<sub>max</sub>(u) of power, may consume an amount 0 &le; c(u) &le; min(s(u),c<sub>max</sub>(u)) of power, and may deliver an amount d(u) = s(u)+p(u)-c(u) of power. The following restrictions apply: c(u) = 0 for any power station, p(u) = 0 for any consumer, and p(u) = c(u) = 0 for any dispatcher. There is at most one power transport line (u,v) from a node u to a node v in the net; it transports an amount 0 &le; l(u,v) &le; l<sub>max</sub>(u,v) of power delivered by u to v. Let Con = &sum;<sub>u</sub>c(u) be the power consumed in the net. The problem is to compute the maximum value of Con.</p>

<table class="table table-bordered" style="width:50%">
	<thead>
		<tr>
			<th>u</th>
			<th>type</th>
			<th>s(u)</th>
			<th>p(u)</th>
			<th>c(u)</th>
			<th>d(u)</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>0</td>
			<td rowspan="2">power station</td>
			<td>0</td>
			<td>4</td>
			<td>0</td>
			<td>4</td>
		</tr>
		<tr>
			<td>1</td>
			<td>2</td>
			<td>2</td>
			<td>0</td>
			<td>4</td>
		</tr>
		<tr>
			<td>3</td>
			<td rowspan="3">consumer</td>
			<td>4</td>
			<td>0</td>
			<td>2</td>
			<td>2</td>
		</tr>
		<tr>
			<td>4</td>
			<td>5</td>
			<td>0</td>
			<td>1</td>
			<td>4</td>
		</tr>
		<tr>
			<td>5</td>
			<td>3</td>
			<td>0</td>
			<td>3</td>
			<td>0</td>
		</tr>
		<tr>
			<td>2</td>
			<td rowspan="2">dispatcher</td>
			<td>6</td>
			<td>0</td>
			<td>0</td>
			<td>6</td>
		</tr>
		<tr>
			<td>6</td>
			<td>0</td>
			<td>0</td>
			<td>0</td>
			<td>0</td>
		</tr>
	</tbody>
</table>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3794.%E2%80%85Power%E2%80%85Network/1be9e8fb.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/3794/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:263px" /></p>

<p>Figure 1. A power network</p>

<p>An example is in figure 1. The label x/y of power station u shows that p(u)=x and p<sub>max</sub>(u)=y. The label x/y of consumer u shows that c(u)=x and cmax(u)=y. The label x/y of power transport line (u,v) shows that l(u,v)=x and l<sub>max</sub>(u,v)=y. The power consumed is Con=6. Notice that there are other possible states of the network but the value of Con cannot exceed 6.</p>

### 입력

<p>There are several data sets in the input text file. Each data set encodes a power network. It starts with four integers: 0 &le; n &le; 100 (nodes), 0 &le; n<sub>p</sub>&nbsp;&le; n (power stations), 0 &le; n<sub>c</sub> &le; n (consumers), and 0 &le; m &le; n<sup>2</sup> (power transport lines). Follow m data triplets (u,v)z, where u and v are node identifiers (starting from 0) and 0 &le; z &le; 1000 is the value of l<sub>max</sub>(u,v). Follow n<sub>p</sub> doublets (u)z, where u is the identifier of a power station and 0 &le; z &le; 10000 is the value of p<sub>max</sub>(u). The data set ends with n<sub>c</sub> doublets (u)z, where u is the identifier of a consumer and 0 &le; z &le; 10000 is the value of c<sub>max</sub>(u). All input numbers are integers. Except the (u,v)z triplets and the (u)z doublets, which do not contain white spaces, white spaces can occur freely in input. Input data terminate with an end of file and are correct.</p>

### 출력

<p>For each data set from the input, the program prints on the standard output the maximum amount of power that can be consumed in the corresponding network. Each result has an integral value and is printed from the beginning of a separate line.</p>