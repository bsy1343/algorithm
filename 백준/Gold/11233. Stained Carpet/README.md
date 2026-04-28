# [Gold III] Stained Carpet - 11233

[문제 링크](https://www.acmicpc.net/problem/11233)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 67, 정답: 16, 맞힌 사람: 13, 정답 비율: 23.636%

### 분류

이분 탐색, 기하학, 수학, 매개 변수 탐색

### 문제 설명

<p>The Algebraist Carpet Manufacturing (ACM) group likes to produce area carpets based upon various geometric figures. The 2014 ACM carpets are all equilateral triangles. Unfortunately, due to a manufacturing defect, some of the carpets are not as stainresistant as intended. The ACM group is offering to replace each defective carpet that contains a stain.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11233.%E2%80%85Stained%E2%80%85Carpet/cb162e1b.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11232/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:229px; width:253px" /></p>

<p>The web form used to report the stained carpet requests the three distances that the stain is away from the corners of the rug. Based upon these three numbers, you need to compute the area of the rug that is to be sent to the customer, or indicate that the customer&rsquo;s carpet doesn&rsquo;t come from ACM.</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. Each test case will consist of a single line with three floating point numbers a, b and c (0 &lt; a,b,c &le; 100) representing the distances from the stain to each of the three corners of the carpet. There will be a single space between a and b, and between b and c.</p>

### 출력

<p>Output a single line with a single floating point number. If there is a carpet that satisfies the constraints, output the area of this carpet. If not, output -1.000. Output this number to exactly three decimal places, rounded. Output no spaces.</p>