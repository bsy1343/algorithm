# [Platinum IV] Art Collections - 25259

[문제 링크](https://www.acmicpc.net/problem/25259)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 162, 정답: 74, 맞힌 사람: 68, 정답 비율: 45.033%

### 분류

애드 혹

### 문제 설명

<p>While your days as an art thief are long past, this does not mean that you lost interest in contemporary art. Unfortunately, you&rsquo;ve been pretty busy lately with BOI preparations. That&rsquo;s why you have lost track of how the $N$ hottest contemporary art collections (conveniently numbered from $1$ to $N$) rank according to value. Since simply asking someone would be quite embarrassing, you will have to resort to different means: anonymous online rankings.</p>

<figure style="width: 234px; float: right;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25259.%E2%80%85Art%E2%80%85Collections/eda9cfd9.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/25259.%E2%80%85Art%E2%80%85Collections/eda9cfd9.png" data-original-src="https://upload.acmicpc.net/1c7f4056-fdd2-4ad1-9f97-6f77514bb3a3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 234px; height: 160px;" />
<figcaption>&ldquo;Readers also liked: 13 SHOCKING applications of Dijkstra&rsquo;s algorithm computer scientists don&rsquo;t want you to know about!&rdquo;</figcaption>
</figure>

<p>That is, you will repeatedly do the following: You first guess a ranking of the $N$ art collections (based on their value, most expensive first), then publish this ranking on some website, and finally wait for the collection owners&rsquo; complaints in the comments section. As you don&rsquo;t want to read each individual comment, you will only keep track of the total number of complaints you receive. Fortunately, the owners&rsquo; behaviour is very reliable: Each of them will complain exactly once for each collection that ranks higher than their own in your guessed ranking although it doesn&rsquo;t in the true ranking, but none will complain about collections you erroneously guessed to rank lower than theirs. You can assume that the values of all collections are distinct.</p>

<p>However, as publishing a ranking puts your anonymity at risk,* you only want to publish up to $4\,000$ guessed rankings before finding the correct ranking of the collections. Write a program that helps you to decide which rankings to publish!</p>

<hr />
<p>* Definitely because of your distinctive writing style and not because you have a tendency to accidentally sign them with your name.</p>

### 입력



### 출력



### 제한

<p>We always have $2 &le; N &le; 4\,000$.</p>