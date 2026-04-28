# [Gold II] Divide the Water - 22648

[문제 링크](https://www.acmicpc.net/problem/22648)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>A scientist Arthur C. McDonell is conducting a very complex chemical experiment. This experiment requires a large number of very simple operations to pour water into every column of the vessel at the predetermined ratio. Tired of boring manual work, he was trying to automate the operation.</p>

<p>One day, he came upon the idea to use three-pronged tubes to divide the water flow. For example, when you want to pour water into two columns at the ratio of 1 : 1, you can use one three-pronged tube to split one source into two.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22648.%E2%80%85Divide%E2%80%85the%E2%80%85Water/cb6d57bc.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22648.%E2%80%85Divide%E2%80%85the%E2%80%85Water/cb6d57bc.png" data-original-src="https://upload.acmicpc.net/8e0d3311-5ff3-4bba-a142-372983d2ee2d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 113px; height: 114px;" /></p>

<p>He wanted to apply this idea to split water from only one faucet to the experiment vessel at an arbitrary ratio, but it has gradually turned out to be impossible to set the configuration in general, due to the limitations coming from the following conditions:</p>

<ol>
	<li>The vessel he is using has several columns aligned horizontally, and each column has its specific capacity. He cannot rearrange the order of the columns.</li>
	<li>There are enough number of glass tubes, rubber tubes and three-pronged tubes. A three-pronged tube always divides the water flow at the ratio of 1 : 1.</li>
	<li>Also there are enough number of fater faucets in his laboratory, but they are in the same height.</li>
	<li>A three-pronged tube cannot be used to combine two water flows. Moreover, each flow of water going out of the tubes must be poured into exactly one of the columns; he cannot discard water to the sewage, nor pour water into one column from two or more tubes.</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22648.%E2%80%85Divide%E2%80%85the%E2%80%85Water/7665203e.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22648.%E2%80%85Divide%E2%80%85the%E2%80%85Water/7665203e.png" data-original-src="https://upload.acmicpc.net/a302894f-6f36-49ec-b0b0-56d25a38f08b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 265px; height: 214px;" /></p>

<ol start="5">
	<li>The water flows only downward. So he cannot place the tubes over the faucets, nor under the exit of another tubes. Moreover, the tubes cannot be crossed.</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22648.%E2%80%85Divide%E2%80%85the%E2%80%85Water/1c447528.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22648.%E2%80%85Divide%E2%80%85the%E2%80%85Water/1c447528.png" data-original-src="https://upload.acmicpc.net/515edb2b-7647-48db-86a8-df17e157fe18/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 433px; height: 208px;" /></p>

<p>Still, Arthur did not want to give up. Although one-to-many division at an arbitrary ratio is impossible, he decided to minimize the number of faucets used. He asked you for a help to write a program to calculate the minimum number of faucets required to pour water into the vessel, for the number of columns and the ratio at which each column is going to be filled.</p>

### 입력

<p>The input consists of an integer sequence.</p>

<p>The first integer indicates&nbsp;<i>N</i>, the number of columns in the vessel. Then the following&nbsp;<i>N</i>&nbsp;integers describe the capacity by which each column should be filled. The&nbsp;<i>i</i>-th integer in this part specifies the ratio at which he is going to pour water into the&nbsp;<i>i</i>-th column.</p>

<p>You may assume that&nbsp;<i>N</i>&nbsp;&le; 100, and for all&nbsp;<i>i</i>,&nbsp;<i>v<sub>i</sub></i>&nbsp;&le; 1000000.</p>

### 출력

<p>Output the number of the minimum faucet required to complete the operation.</p>