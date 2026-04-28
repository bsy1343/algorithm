# [Gold III] Ferries (Easy) - 27664

[문제 링크](https://www.acmicpc.net/problem/27664)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 5, 맞힌 사람: 5, 정답 비율: 45.455%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>One day a group of friends jumped into their 2<em>n</em> cars and they all went for a road trip into the lake district. The cars were numbered 1 through 2<em>n</em>. Initially, they were driving in this order.</p>

<p>During the road trip the convoy encountered multiple ferries, one after another. Each ferry in the district was exactly large enough to accommodate the 2<em>n</em> cars, and there were no other cars around at any time. Whenever the cars used a ferry, their order got mixed up. This is due to the way the ferries are loaded and unloaded.</p>

<p>A ferry is a long and narrow boat. There is just enough room for two columns of cars, each containing <em>n</em> cars. When loading the ferry, the first <em>n</em> cars form the first column and the last <em>n</em> cars form the second column. When unloading the ferry, all cars are allowed to drive away at the same time, so they have to zip in order to form a single convoy. The first car in the new order will always be the first car from the <strong>right</strong> column, the second car will be the first car from the <strong>left</strong> column, the third car will be the second car from the right column, and so on, alternating right and left.</p>

<p>There are two types of ferries. On type-L ferries the crew instructs the cars to fill the <strong>L</strong>eft column first while on type-R ferries cars fill the <strong>R</strong>ight column first. Note that the ferry type does not influence how the cars leave the ferry. The first car to leave is always the first car in the right column.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/be0462de-2f87-4b79-9ec0-c54d5a9fe847/-/preview/" /></p>

<p style="text-align: center;">Above: Cars 1 through 6, in this order, just boarded a type-R ferry (from the bottom of the figure). The cars will leave this ferry in the following order: 1, 4, 2, 5, 3, 6.</p>

<p>The trip is now over. Your car was car <em>x</em>, which means that at the beginning your car was the <em>x</em>-th car from the beginning. You remember a sequence <em>a</em><sub>1</sub>, &hellip;, <em>a</em><sub><em>k</em></sub> of positive integers. The number <em>a</em><sub><em>i</em></sub> means that at some point in time your car was the <em>a</em><sub><em>i</em></sub>-th car from the beginning of the convoy. The numbers in your sequence are in chronological order: your car was <em>a</em><sub><em>i</em></sub>-th before it was <em>a</em><sub><em>i</em> + 1</sub>-th, for all <em>i</em>.</p>

<p>Compute the smallest possible number <em>f</em> of ferries you encountered during the trip. Produce a proof: one possible sequence of exactly <em>f</em> Ls and Rs such that it is possible that the <em>f</em> ferries you encountered were type-L and type-R ferries in the given order.</p>

### 입력

<p>The first line of the input file contains an integer <em>t</em> = 100 specifying the number of test cases. Each test case is preceded by a blank line.</p>

<p>Each test case consists of two lines. The first line contains the integers <em>n</em>, <em>x</em>, and <em>k</em>, where 1 &le; <em>x</em> &le; 2<em>n</em>. The second line contains the integers <em>a</em><sub>1</sub>, &hellip;, <em>a</em><sub><em>k</em></sub>.</p>

### 출력

<p>For each test case, output a single line with the number <em>f</em>, a colon, and one possible shortest string of Ls and Rs. Note that there are no spaces in the output.</p>

### 제한

<ul>
	<li>1 &le; <em>n</em> &le; 10<sup>5</sup></li>
	<li>1 &le; <em>k</em> &le; 20</li>
</ul>

### 힌트

<p>In the first example there were no ferries, the car simply remained in the first place.</p>

<p>In the second example the first type-L ferry moves the car to position 2 and the second such ferry moves it to position 4.</p>

<p>In the third example <code>RR</code> gets us from 2 to 5, <code>L</code> from 5 to 3, <code>RRL</code> from 3 to 1, and <code>L</code> from 1 to 2.</p>