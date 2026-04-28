# [Gold I] Disrupting Defense - 17601

[문제 링크](https://www.acmicpc.net/problem/17601)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 61, 정답: 28, 맞힌 사람: 28, 정답 비율: 52.830%

### 분류

그리디 알고리즘

### 문제 설명

<p>You are playing a tactical game and facing a brutal combat. Your rival&rsquo;s commander uses a circular formation to protect their headquarter, and you have to disrupt their defense to win the battle. The enemy&rsquo;s circular formation consists of n soldiers numbered from 1 to n. In the beginning, soldier i and soldier j are adjacent if |i &minus; j| &isin; {1, n &minus; 1}.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17601.%E2%80%85Disrupting%E2%80%85Defense/0563a09e.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/17601.%E2%80%85Disrupting%E2%80%85Defense/0563a09e.png" data-original-src="https://upload.acmicpc.net/e6e8ddce-696e-478d-91f4-5af3fd8e884d/-/crop/393x385/64,15/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 194px; height: 190px;" /></p>

<p>You only have a small crew of warriors. Your force is too weak to fight more than two soldiers or any two soldiers who are not adjacent. Moreover, if you try to attack a single soldier, both of their adjacent soldiers will come to the rescue. In such situation, it is equivalent to fighting three soldiers. Thus, you may only launch attacks to aim at the gap between two adjacent soldiers. By doing so, you have a chance to take down these two soldiers. Your enemy will fill the gap after your attack. For example, soldiers 3 and n will become adjacent if you take down soldiers 1 and 2. You can repeatedly take down the soldiers until no one can defend their headquarter.</p>

<p>Unfortunately, you are still unable to defeat them in some situations. Each of the soldiers has their own value, and there are at most k different kinds of values in total. You should have heard &ldquo;United we stand, divided we fall&rdquo; before. The soldiers with the same value can unite, and the soldiers with different values cannot. When you attack two soldiers with different values, you always take them down. But when you attack two soldiers with the same value, they will not fall.</p>

<p>Please write a program to find out an attacking strategy to win the battle by disrupting the enemy&rsquo;s defense. That is, take down all n soldiers of the circular formation.</p>

### 입력

<p>The first line contains two integers n and k. n is the number of enemy soldiers. k is the number of kinds of different values. Their values are numbered from 1 to k. The second line contains&nbsp;n integers v<sub>1</sub>, . . . , v<sub>n</sub> where soldier i&rsquo;s value is v<sub>i</sub> for i &isin; {1, . . . , n}.</p>

### 출력

<p>If there is no way to disrupt the enemy&rsquo;s defense, output &minus;1. Otherwise, output n/2 lines. The i-th line describes your i-th attack with two integers p<sub>i</sub> and q<sub>i</sub> separated by a blank. Your i-th attack is to take down soldiers p<sub>i</sub> and q<sub>i</sub>. At that time, they must be adjacent and have different values.</p>

### 제한

<ul>
	<li>2 &le; k &le; n &le; 1000</li>
	<li>n is even.</li>
	<li>If there are multiple solutions, you may output any one of them</li>
</ul>