# [Platinum II] Peace Sign - 16149

[문제 링크](https://www.acmicpc.net/problem/16149)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 8, 정답: 3, 맞힌 사람: 3, 정답 비율: 37.500%

### 분류

수학, 구현, 자료 구조, 브루트포스 알고리즘, 정렬, 기하학, 집합과 맵, 해시를 사용한 집합과 맵, 선형대수학, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p>One of the iconic signs of the 1960s protest movement was the peace sign, shown in the picture below on the left side. On the right, you see (a rotated, scaled version of) the sign for Mercedes Benz, a manufacturer of luxury cars. The similarity between the two has been noted often, and some of the protesters in the 1968 movements have been accused of trading the left sign for the right in their own lives.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16149.%E2%80%85Peace%E2%80%85Sign/53a68abd.png" data-original-src="https://upload.acmicpc.net/7299e885-32f8-46d6-ae5c-cb42667ed48a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 174px; height: 90px;" /></p>

<p>Without analyzing whether former protesters ended up being more economically successful &mdash; or less socially progressive &mdash; later in life than their contemporaries, we will instead focus here on the much more important question how to determine how similar two line drawings are. You will be given two drawings, each consisting of some number of straight lines (no circles). The similarity is the total number of lines in the second image you can exactly match by taking the first image, and doing a combination of (1) translating it some combination of up/down/right/left, (2) rotating it by some angle, and (3) scaling it by some factor. For example, in the given picture (without the circle), you can rotate the left picture 90 degrees to the right, shift it to the right, and scale it by 75%, and match three lines.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line of the data set contains two integers 1 &le; n, n&prime; &le; 50, the number of lines in the first and second image. This is followed by a line with 4n doubles 0.0 &le; x<sub>i,1</sub>, y<sub>i,1</sub>, x<sub>i,2</sub>, y<sub>i,2</sub> &le; 100.0; the i th line in the first image goes from (x<sub>i,1</sub>, y<sub>i,1</sub>) to (x<sub>i,2</sub>, y<sub>i,2</sub>). Next is a line with 4n&prime; doubles 0.0 &le; x&prime;<sub>i,1</sub> , y&prime;<sub>i,1</sub> , x&prime;<sub>i,2</sub> , y&prime;<sub>i,2</sub> &le; 100.0; these describe the n&prime; lines of the second image in the same way.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then output the maximum number of lines in the second image you can match by translating, rotating, and scaling the first image. Our inputs will be such that tiny rounding errors of less than 0.00001 will not affect the results.</p>

<p>Each data set should be followed by a blank line.</p>