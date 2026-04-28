# [Platinum IV] Selling Land - 3667

[문제 링크](https://www.acmicpc.net/problem/3667)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 52, 정답: 22, 맞힌 사람: 14, 정답 비율: 37.838%

### 분류

자료 구조, 스택

### 문제 설명

<p>As you may know, the country of Absurdistan is full of abnormalities. For example, the whole country can be divided into unit squares that are either grass or swamp. Also, the country is famous for its incapable bureaucrats. If you want to buy a piece of land (called a parcel), you can only buy a rectangular area, because they cannot handle other shapes. The price of the parcel is determined by them and is proportional to the perimeter of the parcel, since the bureaucrats are unable to multiply integers and thus cannot calculate the area of the parcel.</p>

<p>Per owns a parcel in Absurdistan surrounded by swamp and he wants to sell it, possibly in parts, to some buyers. When he sells a rectangular part of his land, he is obliged to announce this to the local bureaucrats. They will first tell him the price he is supposed to sell it for. Then they will write down the name of the new owner and the coordinates of the south-east corner of the parcel being sold. If somebody else already owns a parcel with a south-east corner at the same spot, the bureaucrats will deny the change of ownership.</p>

<p>Per realizes that he can easily trick the system. He can sell overlapping areas, because bureaucrats only check whether the south-east corners are identical. However, nobody wants to buy a parcel containing swamp.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3667.%E2%80%85Selling%E2%80%85Land/f3b9bf55.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/3667.%E2%80%85Selling%E2%80%85Land/f3b9bf55.png" data-original-src="https://www.acmicpc.net/upload/images2/sellingland.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:246px; width:206px" /></p>

<p>In this example, dark squares represent swamp. Per may, for example, sell three overlapping grey areas, with dimensions 2 &times; 1, 2 &times; 4 and 4 &times; 1 respectively. The total perimeter is 6 + 12 + 10 = 28. Note that he can get more money by selling even more land. This figure corresponds to the case in the sample input.</p>

<p>Now Per would like to know how many parcels of each perimeter he needs to sell in order to maximize his profit. Can you help him? You may assume that he can always find a buyer for each piece of land, as long as it doesn&rsquo;t contain any swamps. Also, Per is sure that no square within his parcel is owned by somebody else.</p>

### 입력

<p>On the first line a positive integer: the number of test cases, at most 100. After that per test case:</p>

<ul>
	<li>One line with two integers n and m (1 &le; n, m &le; 1 000): the dimensions of Per&rsquo;s parcel.</li>
	<li>n lines, each with m characters. Each character is either &lsquo;#&rsquo; or &lsquo;.&rsquo;. The j-th character on the i-th line is a &lsquo;#&rsquo; if position (i, j) is a swamp, and &lsquo;.&rsquo; if it is grass. The north-west corner of Per&rsquo;s parcel has coordinates (1, 1), and the south-east corner has coordinates (n, m).</li>
</ul>

### 출력

<p>Per test case:</p>

<ul>
	<li>Zero or more lines containing a complete list of how many parcels of each perimeter Per needs to sell in order to maximize his profit. More specifically, if Per should sell pi parcels of perimeter i in the optimal solution, output a single line &ldquo;p<sub>i</sub> x i&rdquo;. The lines should be sorted in increasing order of i. No two lines should have the same value of i, and you should not output lines with p<sub>i</sub> = 0.</li>
</ul>