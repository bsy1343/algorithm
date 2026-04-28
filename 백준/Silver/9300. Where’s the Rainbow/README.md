# [Silver V] Where’s the Rainbow - 9300

[문제 링크](https://www.acmicpc.net/problem/9300)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 366, 정답: 81, 맞힌 사람: 70, 정답 비율: 28.926%

### 분류

수학, 기하학

### 문제 설명

<p>After a long day of working on HSPC problems, you see a rainbow in the sky and want to figure out how far you have to walk to get your pot of gold. You are given a 2D plane and a semi-circle (rainbow) of height h placed with the center somewhere along the x-axis. You are also given an angle of inclination to view the top of the rainbow from the origin. Find how far away the closest point on the rainbow is to you by using the picture below to solve for d, the distance between you and the closest point on the rainbow. You can ignore the height/width of the person; treat them as a point.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/9300.%E2%80%85Where%E2%80%99s%E2%80%85the%E2%80%85Rainbow/1d722bf9.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/9300.%E2%80%85Where%E2%80%99s%E2%80%85the%E2%80%85Rainbow/1d722bf9.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9300/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:253px; width:641px" /></p>

### 입력

<p>The first line of input is the number of test cases that follow. Each successive line represents a single test case, and will be composed of two floating point numbers, separated by a single space. The first value is h (1 &le; h &le; 10<sup>5</sup>), the height of the rainbow at its highest point. The second is the angle of inclination &theta; (0 &lt; &theta; &lt; 90).&nbsp;These real numbers will consist of decimal digits and at most one decimal point.</p>

### 출력

<p>For each case output the line &ldquo;Case x:&rdquo; where x is the case number, on a single line, followed by d, the distance from you to the rainbow,&nbsp;with an absolute or relative error of at most 10<sup>&minus;6</sup>.</p>

<p>If you and the rainbow are infinitely far way from each other, print &quot;Infinity&quot;.</p>