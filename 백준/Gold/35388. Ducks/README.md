# [Gold I] Ducks - 35388

[문제 링크](https://www.acmicpc.net/problem/35388)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

분할 정복을 이용한 거듭제곱, 수학, 조합론, 포함 배제의 원리

### 문제 설명

<p>The founder and ruler of the Samo Empire, the Frankish merchant Samo, who lived in the first half of the seventh century, was known for serving roasted ducks and hares as delicacies to foreign envoys and visiting rulers at his ceremonial feasts.</p>

<p>In his kitchen, a special collection of $N$ long finely forged grillsticks was reserved for those grand occasions. Each grillstick had its own ceremonial name and was used to roast exactly $4$ animals, each either a duck or a hare.</p>

<p>No matter how many guests attended, Samo upheld three strict rules:</p>

<ul>
<li>all grillsticks must be used, that is, the total number of animals roasted was always $4 \cdot N$,</li>
<li>in the whole feast, the total number of ducks has to be equal to the total number of hares,</li>
<li>at least one grillstick must contain only ducks.</li>
</ul>

<p>Before serving, Samo would lay out all the grillsticks in a fixed, ritual order upon the banquet table and recite an invocation to the powerful spirits.</p>

<p>A sharp-eyed young cook once noticed that the head chef arranged the animals on the grillsticks slightly differently for each feast. No two feasts were ever identical — for any pair of feasts, there was always at least one grillstick that differed, either in the number of ducks and hares or, if those numbers matched, in the order in which they were arranged.</p>

<p>“How many different feasts can be prepared under such a rule,” the young cook once asked the senior, “if every feast must have its grillsticks arranged differently?” But the older cook did not know the answer. He only laughed and said, “Ask the magicians.” Of course, had he known what the distant future would bring, he might also have said, “Ask the programmers.”</p>

### 입력

<p>Input contains one integer $N$ ($1 \le N \le 10^5$), the number of grillsticks in Samo’s kitchen.</p>

### 출력

<p>Print the number of distinct feasts which can be served while maintaining the conditions imposed by Samo. As the number may be huge, output the result modulo $10^9 + 7$.</p>