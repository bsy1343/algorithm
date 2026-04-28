# [Platinum I] Fields and Farmers - 3431

[문제 링크](https://www.acmicpc.net/problem/3431)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 45, 정답: 13, 맞힌 사람: 9, 정답 비율: 56.250%

### 분류

많은 조건 분기, 다이나믹 프로그래밍, 부분집합의 합 다이나믹 프로그래밍

### 문제 설명

<p>Being a farmer in Ardenia is a tough job. We do not mean only the dry and hostile environment where they have to pasture sheep. The government (or actually the king himself) wants his people to invade foreign lands rather than to harvest theirs, and thus tries to make the lives of poor farmers as hard as possible. All difficulties start with a seemingly simple task: purchasing a piece of land, called farming parcel.</p>

<p>The whole farming territory is a huge rectangular grid consisting of square fields; a farming parcel consists of some of these fields. At the beginning a farmer buys an initial set of fields; his parcel consists initially just of these fields. However, the actual farming parcel is determined with the help of string and poles, by repeating the following steps.</p>

<ol>
	<li>Stick a pole into the middle of each field from the farming parcel.</li>
	<li>Surround the poles with a string, creating the smallest region enclosing all the poles.</li>
	<li>The new farming parcel is the set of all fields having a non-empty intersection with this region. A field sharing just the edge or a corner with the region does not count.</li>
</ol>

<p>Of course, the parcel may only increase by implementing the operation above, so each farmer makes sure these steps are repeated till the farming parcel does not change; we call such a parcel final. An example is depicted below. The initial farming parcel consists of four fields (figure A), after one iteration it grows (figure B), and after another one it becomes final (figure C).</p>

<p><img alt="" src="/upload/images2/field.png" style="height:126px; width:553px" /></p>

<p>It appears, however, that the final farming parcel would sometimes be the same even if the farmer did not buy all the initial fields but just a subset of them. A subset of this property is called valid. The farmer wants to know in how many ways he may choose a valid subset of initial fields.</p>

<p>The input contains several test cases. The first line of the input contains a positive integer Z &le; 50, denoting the number of test cases. Then Z test cases follow, each conforming to the format described in section Input. For each test case, your program has to write an output conforming to the format described in section Output.</p>

### 입력

<p>The first line of the input instance contains a positive integer n &le; 10<sup>6</sup>, being the number of initial fields of the parcel. Each of the following n lines contain two integers x<sub>i</sub>, y<sub>i</sub> &isin; [&minus;10<sup>9</sup>, 10<sup>9</sup>], being the coordinates of these fields. All initial fields are different.</p>

### 출력

<p>Let k be the number of valid subsets of the initial fields. You should output a line containing the number k mod (10<sup>9</sup> + 7).</p>