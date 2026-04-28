# [Platinum IV] Television Reception - 11436

[문제 링크](https://www.acmicpc.net/problem/11436)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 256 MB

### 통계

제출: 8, 정답: 3, 맞힌 사람: 3, 정답 비율: 42.857%

### 분류

브루트포스 알고리즘, 기하학, 오목 다각형 내부의 점 판정

### 문제 설명

<p>Under Soviet influence, media access in East Germany was heavily regulated. Like most autocratic r&acute;egimes (and many r&acute;egimes that consider themselves &ldquo;democratic&rdquo;), the Communist government did not want the citizens of East Germany to learn about actual goings-on in the world, in particular if they conflicted with the image of the &ldquo;decadent, depraved, and about-to-collapse West&rdquo; that was being promulgated. However, many East Germans surreptitiously managed to receive Western channels and would watch them in their own homes. Of course, whether one would receive such channels would depend on where the TV tower(s) were located, and at what distance from one&rsquo;s own home, and whether there were any blocking devices too close to one&rsquo;s home. Here, you are to calculate how many people from the East can receive a West German TV signal.</p>

<p>You will be given the contours of East Germany as a polygon in counterclockwise order, the locations and broadcast radii of several TV towers, and the locations and broadcast radii of the blockers. A household can receive Western TV if it is within the broadcast radius of at least one West German TV tower, and not within the broadcast radius of any blockers. We will always ensure that each household is at least 0.001 away from the border of the range of any TV tower or blocker in either direction.</p>

### 입력

<p>The first line is the number K of input data sets, followed by K data sets, each of the following form:</p>

<p>The first line contains four integers n, H, T, B. 3 &le; n &le; 1000 is the number of points used to describe the geography of East Germany. 0 &le; H &le; 1000 is the number of households you will be given. 0 &le; T &le; 50 is the number of TV towers, and 0 &le; B &le; 50 is the number of blockers.</p>

<p>This is followed by n lines, each containing two doubles, which give you the position of one corner of the polygon describing the country. We will ensure that the polygon never crosses itself.</p>

<p>Next are H lines, each containing two doubles, which give you the position of a household. We will guarantee that each household lies entirely inside East Germany.</p>

<p>After this, we have T lines, each containing three doubles x<sub>i</sub>, y<sub>i</sub>, r<sub>i</sub>. (x<sub>i</sub>, y<sub>i</sub>) gives you the position of the i th TV tower, and r<sub>i</sub> &ge; 0 is its broadcast radius. Towers may be either inside or outside East Germany; they will never lie on the boundary. Any tower not inside East Germany is considered in West Germany (even though that&rsquo;s not technically correct).</p>

<p>Finally, there are B lines, each containing three doubles x<sub>i</sub>, y<sub>i</sub>, r<sub>i</sub>. Here, (x<sub>i</sub>, y<sub>i</sub>) is the position of the i th blocker, and r<sub>i</sub> &ge; 0 its broadcast radius. Blockers will always lie inside East Germany.</p>

<p>Recall that a household receives West German TV if it is within the broadcast radius of at least one TV tower located in West Germany, and not within the broadcast radius of any blocker.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number.</p>

<p>Then output the total number of households that can receive West German TV.</p>

<p>Each data set should be followed by a blank line.</p>