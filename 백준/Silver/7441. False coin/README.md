# [Silver III] False coin - 7441

[문제 링크](https://www.acmicpc.net/problem/7441)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 94, 정답: 43, 맞힌 사람: 39, 정답 비율: 47.561%

### 분류

브루트포스 알고리즘, 구현

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/7441.%E2%80%85False%E2%80%85coin/49985900.png" data-original-src="https://www.acmicpc.net/upload/images2/falsecoin.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:140px; width:184px" />The &ldquo;Gold Bar&rdquo; bank received information from reliable sources that in their last group of N coins exactly one coin is false and differs in weight from other coins (while all other coins are equal in weight). After the economic crisis they have only a simple balance available (like one in the picture). Using this balance, one is able to determine if the weight of objects in the left pan is less than, greater than, or equal to the weight of objects in the right pan.&nbsp;</p>

<p>In order to detect the false coin the bank employees numbered all coins by the integers from 1 to N, thus assigning each coin a unique integer identifier. After that they began to weight various groups of coins by placing equal numbers of coins in the left pan and in the right pan. The identifiers of coins and the results of the weightings were carefully recorded.&nbsp;</p>

<p>You are to write a program that will help the bank employees to determine the identifier of the false coin using the results of these weightings.&nbsp;</p>

### 입력

<p>The first line of the input file contains two integers N and K, separated by spaces, where N is the number of coins (2 &le; N &le; 100) and K is the number of weightings fulfilled (1&le; K &le; 100). The following 2K lines describe all weightings. Two consecutive lines describe each weighting. The first of them starts with a number P<sub>i</sub> (1 &le; P<sub>i</sub> &le; N/2), representing the number of coins placed in the left and in the right pans, followed by P<sub>i</sub> identifiers of coins placed in the left pan and P<sub>i</sub> identifiers of coins placed in the right pan. All numbers are separated by spaces. The second line contains one of the following characters: &#39;&lt;&#39;, &#39;&gt;&#39;, or &#39;=&#39;. It represents the result of the weighting:&nbsp;</p>

<ul>
	<li>&#39;&lt;&#39; means that the weight of coins in the left pan is less than the weight of coins in the right pan,&nbsp;</li>
	<li>&#39;&gt;&#39; means that the weight of coins in the left pan is greater than the weight of coins in the right pan,&nbsp;</li>
	<li>&#39;=&#39; means that the weight of coins in the left pan is equal to the weight of coins in the right pan.&nbsp;</li>
</ul>

### 출력

<p>Write to the output file the identifier of the false coin or 0, if it cannot be found by the results of the given weightings.</p>