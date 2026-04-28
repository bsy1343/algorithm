# [Platinum III] Lecture Screens - 5209

[문제 링크](https://www.acmicpc.net/problem/5209)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 1, 맞힌 사람: 1, 정답 비율: 16.667%

### 분류

기하학, 선분 교차 판정, 스위핑

### 문제 설명

<p>Most of you have probably had lectures or seen talks in one of the classrooms (like OHE studios) which have multiple displays of the same screen, which is used for PowerPoint or other presentations. The reason is obvious: often enough, a pillar, or the head of the person in front of you, partially or completely obstructs the view of one screen, and you have a better chance of seeing everything if there are multiple copies. But just how much of the content does one see, depending on the seating position?</p>

<p>Here&rsquo;s how we can model this. We&rsquo;ll ignore people&rsquo;s heads, and just focus on architectural obstruction. The lecture hall is given to you as a closed and simple polygon (i.e., walls don&rsquo;t cross). In addition, you are given multiple positions of screens as lines in 2D, and your own position within the polygon. For each screen, you may see some or all of it from your position. Now, if you take the union of the contents you see, we want to calculate just how much content you get. For instance, if you see the left half of one screen and the right half of another, you see 100%. But if you see the left half of both, you only see 50% of the content. Also, if you see a screen from the back (meaning that its right side is to your left), then you can&rsquo;t see any of the contents.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5209.%E2%80%85Lecture%E2%80%85Screens/f11bb34c.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/5209.%E2%80%85Lecture%E2%80%85Screens/f11bb34c.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5209/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:201px; width:217px" />In the picture on the right, the thick lines are the walls of the lecture hall. The arrows depict the screens, and point from the left to the right side. The gray shaded areas denote your view cone, and where they meet the arrow is the screen area you can see. Notice that the screen below the person is oriented the wrong way, so it is not visible. In the example on the right, you can see 90% (all but the leftmost 10%) of the screen. The input data corresponding to this example is given below.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of the data set contains four numbers n, m, x, y. 3 &le; n &le; 100 is the number of corner points of the polygon. 1 &le; m &le; 20 is the number of screens in the room, and (x, y) is your seating position (x and y are real numbers).</p>

<p>This is followed by n lines, each containing two real numbers (x<sub>i</sub>, y<sub>i</sub>). These are the positions of the ith corner point of the classroom. That means that there are walls from point (x<sub>i</sub>, y<sub>i</sub>) to (x<sub>i+1</sub>, y<sub>i+1</sub>) for all i, as well as a wall from (x<sub>n</sub>, y<sub>n</sub>) to (x<sub>1</sub>, y<sub>1</sub>).</p>

<p>Finally, there are m lines, each containing four real numbers (ℓ<sub>x</sub><sup>j</sup>, ℓ<sub>y</sub><sup>j</sup>),(r<sub>x</sub><sup>j</sup>, r<sub>y</sub><sup>j</sup>), which are the x- and ycoordinates of the left and right endpoints of the jth screen.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the percentage of content that you can see, rounded to two decimals.</p>