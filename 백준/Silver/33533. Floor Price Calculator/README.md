# [Silver V] Floor Price Calculator - 33533

[문제 링크](https://www.acmicpc.net/problem/33533)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 65, 정답: 58, 맞힌 사람: 48, 정답 비율: 92.308%

### 분류

수학

### 문제 설명

<p>A year ago, your friend John moved to Delft. Recently, he called you to ask your for your help: he wants to redecorate his house. You spent many hours looking for all kinds of furniture and decorations. Now there’s only one thing left: he wants a new floor in his house. You and John decide to visit a store nearby to look for a nice one.</p>

<p>After looking a bit around in the shop, John noticed a special floor that has the pattern of a checkerboard. The floor is very special since it is sold in one big piece and not in separate black and white tiles. John is interested in the floor and asks the shop keeper for more information. The size of his floor is $5\times 5$ (thus $ 25m^2 $) and a floor in this size will cost him $55$ euro. He asks how this price is calculated: it turns out that the floor costs one euro for every square that can be found on the floor. Note that each black or white tile has a size of $1 \times 1$ meter. So for instance, the figure visible to the right, has a size of $2 \times 2$ meter. In the figure, we count a total of five squares.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/33533.%E2%80%85Floor%E2%80%85Price%E2%80%85Calculator/7f3428bd.png" data-original-src="https://boja.mercury.kr/assets/problem/33533-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 200px;"></p>

<p style="text-align: center;">Figure 1: A floor with five squares.</p>

<p>John decides to buy the floor and it looks amazing in his house! You decide to also buy this particular floor but your house is way bigger and you would like to know how much you will have to pay. You decide to write a program to calculate the total price in euro for a given floor of $ n \times n $ meters.</p>

### 입력

<p>An integer $ n $ with $ n \leq10^5 $, representing a $ n \times n $ floor.</p>

### 출력

<p>The price in euro you have to pay for the $ n \times n $ floor.</p>