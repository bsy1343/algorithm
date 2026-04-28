# [Silver I] Alley - 31018

[문제 링크](https://www.acmicpc.net/problem/31018)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 11, 맞힌 사람: 11, 정답 비율: 91.667%

### 분류

자료 구조, 정렬, 스택

### 문제 설명

<p>In the beautiful industrial city of ACM, lies grandiose buildings and only the most gentrified neighborhoods. It&#39;s been said by scholars and street peddlers alike that it&#39;s the city of gold. They call the ACM city the one where dreams come true. If you&#39;re not here, you would wish you were. And if you were here, you&#39;d never want to leave.</p>

<p>Well, that&#39;s what your friends keep telling you anyway.</p>

<p>In light of your new promotion to becoming the technical director at your firm, they decided to throw you a party on the most luxurious parade float during the ACM city&#39;s yearly party <em>Jour R&eacute;gionaux</em>.</p>

<p>Anticipation made time go quickly and now that wonderful day of which you dreamed about has arrived! You make your arrangements, and follow your itinerary, staring out of the window of the limo your friends hired to begin your journey.</p>

<p>During your continuous amazement at the sights around you, your limo suddenly stops short! Outside you hear people arguing and screaming. &quot;What could be going on??&quot; you wonder to yourself. You always had the issue of never being able to resist a problem. Luckily there was one right on the same street as you.</p>

<p>You notice that all the directors of each float in the parade are arguing amongst themselves! Listening in on the conversation, you overhear their disgruntled attitudes at how they ended up in such a predicament just before going out to perform for the awaiting crowd. Their carriages had somehow ended up out of order!</p>

<p>You say out loud, &quot;I know how to put things in order!&quot;, and begin to take charge. Rallying the float drivers from the other floats in the parade, you reassure them that you will do your best to figure a way out. Looking around you notice there&#39;s a side alley. Unfortunately it&#39;s as narrow as the street you&#39;re on; neither the street nor the alley is wide enough for any float to pass another. Also, no float can can go backwards down the main street. The alley is a dead end, but you can store floats there temporarily. At any point in time, the float in the alley closest to the street may return to the street and continue down its route.</p>

<p>The parade director gave you a list of the floats in their correct order. Being the brainiac that you are, you swiftly realize the license plates are in sorted order on his list while the floats aren&#39;t.</p>

<p>Needing to get the show on the road, can you determine if you&#39;re able to get the parade back in working order?</p>

### 입력

<p>The first line of input will contain the number of test cases, <code>N</code> (<code>1 &le; N &le; 100</code>). Each of the following <code>N</code> lines contains a test case.</p>

<p>Each test case line begins with the number of floats, <code>F</code> (<code>1 &le; F &le; 100</code>) and is followed by <code>F</code> distinct license plates representing floats in their initial order. Each license plate contains between one and three characters from the set <code>0-9</code> and <code>A-Z</code>.</p>

### 출력

<p>For each case, output a single line containing &quot;Yes&quot; or a &quot;No&quot; depending on if you&#39;re able to rearrange the floats into sorted order based on their license plates. For sorting purposes, <code>0 &lt; 9 &lt; A &lt; Z</code>, and if one license plate is a prefix of another, the shorter one is first (<code>0 &lt; 00 &lt; 0Z &lt; 1</code>).</p>