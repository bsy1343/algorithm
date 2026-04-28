# [Platinum V] Just the Last Digit - 18076

[문제 링크](https://www.acmicpc.net/problem/18076)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 87, 정답: 51, 맞힌 사람: 48, 정답 비율: 59.259%

### 분류

수학, 다이나믹 프로그래밍, 그래프 이론

### 문제 설명

<p>Jessie has recently started jogging and tracking the progress with a fitness band. There are n spectacular spots on a nearby hill. As running uphill is hard for an amateur jogger, Jessie is only going to run downhill. The spots have numbers from 1 to n, the higher the number is, the lower the spot is. Some pairs of spots are connected by trails, and for our purpose, we will only consider trails i &rarr; j going from a higher spot to a lower spot (i &lt; j).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18076.%E2%80%85Just%E2%80%85the%E2%80%85Last%E2%80%85Digit/3219135e.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/18076.%E2%80%85Just%E2%80%85the%E2%80%85Last%E2%80%85Digit/3219135e.png" data-original-src="https://upload.acmicpc.net/8a3606a0-bad2-409a-b97c-1f46faf4dc05/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 262px; height: 186px;" /></p>

<p>Jessie successfully finished some number of jogs, running through each possible sequence of spots, for which a trail between any two consecutive spots exists, exactly once. Now Jessie is planning to restore the map of all trails with the help of data collected by the fitness band. Unfortunately, the display on the band is small, and can only show the last digit of the number of jogs Jessie did between each pair of spots i and j where 1 &le; i &lt; j &le; n. Can you help Jessie restore the map of the hill given this data?</p>

### 입력

<p>The first line of the input contains an integer n &mdash; the number of spots on the hill (2 &le; n &le; 500). Next, n lines follow: the i-th line contains n characters a<sub>i,1</sub>, a<sub>i,2</sub>, . . . , a<sub>i,n</sub>. Character a<sub>i,j</sub> is the last digit of the number of different jogs made by Jessie starting at the i-th spot and ending at the j-th spot. For every i &ge; j, a<sub>i,j</sub> = 0.</p>

<p>It is guaranteed that a solution always exists for the given input data.</p>

### 출력

<p>Print n lines, describing the map of the hill in the similar format: the i-th line should contain n characters, where j-th character is 1 if there is a trail from the i-th spot to the j-th spot, and 0 otherwise. For every i &ge; j, the j-th character in the i-th row must be 0.</p>