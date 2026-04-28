# [Silver I] Pub-lic Good - 11190

[문제 링크](https://www.acmicpc.net/problem/11190)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 91, 정답: 46, 맞힌 사람: 38, 정답 비율: 49.351%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>A bit over three years ago, you were elected president of the glorious and picturesque country of Molvan&icirc;a, a land untouched by modern dentistry. To secure your landslide victory in the election you had to make a few promises, some of which, with the clarity of hindsight, may have been a tad exaggerated.</p>

<p>Molvan&icirc;a&rsquo;s economy is quite simple compared to that of most other countries. The two main professions in Molvan&icirc;a are pubowners, and beer-drinkers. These two groups combined account for over 75% of the Molvan&icirc;an GDP (Gross Domestic Product). Slightly simplified, the system works like this: the beer-drinkers borrow money to pay for their beer. This creates income for the pub-owners. The pub-owners use their income to purchase AAA-rated bonds, backed by loans to beer-drinkers. This system is locally referred to as pub-prime lending.</p>

<p>One of your election-time promises was to further optimize Molvan&icirc;a&rsquo;s Tiger economy through improved city planning. You have identified a number of suitable construction sites in which either a pub or a house of a beerdrinker can be built. There are walkways between some of these sites. To fully optimize the economy, you want to place buildings such that each house has at least one pub at only a walkway&rsquo;s distance, and each pub has at least one house at only a walkway&rsquo;s distance. It might happen that this is impossible, but you will try your best.</p>

<p>Beware that the city has a quite peculiar lay-out, and it may not even be possible to draw it on a normal map. Molvan&icirc;a is special that way.</p>

### 입력

<p>There are n construction sites and m walkways in the city (1 &le; n &le; 10 000 and 0 &le; m &le; 100 000). The first line contains n and m, separated by a single space. The next m lines contain integers x and y (1 &le; x, y &le; n) indicating that there is a walkway between x and y. There are no loops (i.e., x &ne; y) and all lines with walkway descriptions are distinct.</p>

### 출력

<p>If it is impossible to build pubs and houses such that every pub is next to a house and every house is next to a pub, print Impossible on a line. Otherwise output n space separated words. Print pub or house for each construction site. The first word indicates what to build at construction site 1, the next at construction site 2, and so on. If there are multiple valid solutions, you can output any of them.</p>