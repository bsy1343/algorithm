# [Gold II] Buy or Build - 7452

[문제 링크](https://www.acmicpc.net/problem/7452)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 8, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

그래프 이론, 자료 구조, 브루트포스 알고리즘, 비트마스킹, 분리 집합, 최소 스패닝 트리

### 문제 설명

<p>World Wide Networks (WWN) is a leading company that operates large telecommunication networks. WWN would like to setup a new network in Borduria, a nice country that recently managed to get rid of its military dictator Kurvi-Tasch and which is now seeking for investments of international companies (for a complete description of Borduria, have a look to the following Tintin albums &ldquo;King Ottokar&rsquo;s Sceptre&rdquo;, &ldquo;The Calculus Affair&rdquo; and &ldquo;Tintin and the Picaros&rdquo;). You are requested to help WWN todecide how to setup its network for a minimal total cost.</p>

<p>There are several local companies running small networks (called subnetworks in the following) that partially cover the n largest cities of Borduria. WWN would like to setup a network that connects all n cities. To achieve this, it can either build edges between cities from scratch or it can buy one or several subnetworks from local companies. You are requested to help WWN to decide how to setup its network for a minimal total cost.</p>

<ul>
	<li>All n cities are located by their two-dimensional Cartesian coordinates.</li>
	<li>There are q existing subnetworks. If q &ge; 1 then each subnetwork c (1 &le; c &le; q) is defined by a set of interconnected cities (the exact shape of a subnetwork is not relevant to our problem).</li>
	<li>A subnetwork c can be bought for a total cost wc and it cannot be split (i.e., the network cannot be fractioned).</li>
	<li>To connect two cities that are not connected through the subnetworks bought, WWN has to build an edge whose cost is exactly the square of the Euclidean distance between the cities.</li>
</ul>

<p>You have to decide which existing networks you buy and which edges you setup so that the total cost is minimal. Note that the number of existing networks is always very small (typically smaller than 8).</p>

### 입력

<p>The input begins with a single positive integer on a line by itself indicating the number of the cases following, each of them as described below. This line is followed by a blank line, and there is also a blank line between two consecutive inputs.</p>

<p>Each test case is described by one input file that contains all the relevant data. The first line contains the number n of cities in the country (1 &le; n &le; 1000) followed by the number q of existing subnetworks (0 &le; q &le; 8). Cities are identified by a unique integer value ranging from 1 to n. The first line is followed by q lines (one per subnetwork), all of them following the same pattern: The first integer is the number of cities in the subnetwork. The second integer is the the cost of the subnetwork (not greater than 2 &times; 10<sup>6</sup>). The remaining integers on the line (as many as the number of cities in the subnetwork) are the identifiers of the cities in the subnetwork. The last part of the file contains n lines that provide the coordinates of the cities (city 1 on the first line, city 2 on the second one, etc). Each line is made of 2 integer values (ranging from 0 to 3000) corresponding to the integer coordinates of the city.</p>

### 출력

<p>For each test case, your program has to write the optimal total cost to interconnect all cities. The outputs of two consecutive cases will be separated by a blank line.</p>

<p>A 115 Cities Instance</p>

<p>Consider a 115 cities instance of the problem with 4 subnetworks (the 4 first graphs in Figure 1). As mentioned earlier the exact shape of a subnetwork is not relevant still, to keep figures easy to read, we have assumed an arbitrary tree like structure for each subnetworks. The bottom network in Figure 1 corresponds to the solution in which the first and the third networks have been bought. Thin edges correspond to edges build from scratch while thick edges are those from one of the initial networks.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7452/1.png" style="height:470px; width:452px" /></p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7452/2.png" style="height:223px; width:221px" /></p>

<p style="text-align: center;">Figure 1: A 115 Cities Instance and a Solution (Buying the First and the Third Network)</p>

### 힌트

<p>The sample input instance is shown in Figure 2. An optimal solution is described in Figure 3 (thick edges come from an existing network while thin edges have been setup from scratch).</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7452/3.png" style="height:189px; width:579px" /></p>

<p style="text-align: center;">Figure 2: The 7 City instance of the sample input</p>

<p>An optimal solution of the 7 City instance in which which the first and second existing networkshave been bought while two extra edges (1,5) and (2,4) have been setup</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7452/4.png" style="height:209px; width:174px" /></p>

<p style="text-align: center;">Figure 3</p>