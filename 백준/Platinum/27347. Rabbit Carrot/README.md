# [Platinum IV] Rabbit Carrot - 27347

[문제 링크](https://www.acmicpc.net/problem/27347)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 51, 정답: 23, 맞힌 사람: 22, 정답 비율: 45.833%

### 분류

가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>Rabbit called Carrot is willing to cross the bridge. The bridge consists of $N$ poles of different height. Carrot can jump at most $M$ centimeters up and any distance down.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27347.%E2%80%85Rabbit%E2%80%85Carrot/51d97b1d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27347.%E2%80%85Rabbit%E2%80%85Carrot/51d97b1d.png" data-original-src="https://upload.acmicpc.net/bfe1fd0c-f169-4416-8e59-cda1e423cc8a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 288px; height: 152px;" /></p>

<p>The rabbit starts crossing the bridge from the left and is standing at height zero immediately before the first pole. The goal of the Carrot is to reach the other side of the bridge by jumping on each pole in order.</p>

<p>However, it might happen, that the rabbit will not be able to jump on some poles as it will be too high.</p>

<p>Help the rabbit Carrot to cross the bridge by modifying the heights of some poles. Calculate the smallest possible amount of poles the height of which has to be either increased or decreased so that the Carrot could cross the bridge. Height of each of the poles can be increased by any amount and decreased to a non-negative value.</p>

### 입력

<p>The first line contains two integers: the number of bridge poles $N$ and the Carrot leap-up size $M$. The following $N$ lines contain the heights of the poles $a_i$ given as integers one number per line.</p>

### 출력

<p>Output one integer &ndash; the least number of poles that have to be either lifted or lowered so that the rabbit Carrot could cross the bridge.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 200\,000$</li>
	<li>$0 &le; M &le; 5\,000$</li>
	<li>$0 &le; a_i &le; 10^9$</li>
</ul>