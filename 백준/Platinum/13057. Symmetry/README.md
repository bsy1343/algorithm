# [Platinum IV] Symmetry - 13057

[문제 링크](https://www.acmicpc.net/problem/13057)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 15, 맞힌 사람: 13, 정답 비율: 50.000%

### 분류

기하학

### 문제 설명

<p>You are totally bored with nothing to do. You notice a pattern of spots on the wall in front of you and begin to dwell on them. There is no obvious pattern of symmetry. With time this becomes very grating, and you contemplate adding more spots to satisfy your quest for balance. For this exercise you are to resolve this situation with a computer program.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13057.%E2%80%85Symmetry/08c70e1f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13057/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:276px; width:443px" /></p>

<p>Given an array of spots with coordinates in the range from &minus;20,000 to 20,000, determine the fewest additional spots needed to generate a pattern with some symmetry. The symmetry can be around a point or across a line. If the symmetry is around a point, the point does not need to be a spot in the data, or even a point with integral coordinates. If the symmetry is across a line, the line may be at any angle. The coordinates of the additional spots may or may not be within the &minus;20,000 to 20,000 limits.</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. The first line of input will consist of a single integer n (1 &le; n &le; 1,000) indicating the number of spots. Each of the next n lines will hold two space-separated integers x and y (&minus;20,000 &le; x, y &le; 20,000), which are the coordinates of a spot. The locations of all spots are guaranteed to be unique.</p>

### 출력

<p>Output a single integer, indicating the smallest number of spots which need to be added so that all of the spots are symmetric about some point, or about some line.</p>