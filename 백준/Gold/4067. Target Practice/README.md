# [Gold II] Target Practice - 4067

[문제 링크](https://www.acmicpc.net/problem/4067)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 11, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>There are many forms of contests where the contestants (shooters) try to hit targets, either moving or still. In this version there are a number of small balloons sitting on the tops of poles that are in turn stuck in the ground at various points in a large field. These poles are not all the same height. The shooter circles the field and fires at the balloons, the goal being to burst all the balloons with as few shots as possible. Since the balloons offer almost no resistance to a bullet, the bullet will pass right through and possibly hit one or more other balloons. So, by judiciously taking shots, the shooter might need only a very few shots to hit all the targets (provided the shooter is a good marksman, which we will assume is the case).</p>

<p>For example, the following field of 10 targets can be covered in only four shots, as shown. (The first two numbers at each position indicate the position of the balloon, and the third number the height.)</p>

<p><img alt="" src="/upload/images2/target.png" style="height:218px; width:337px" /></p>

<p>Your job is to determine the fewest number of shots necessary to hit all the targets in a given field.</p>

### 입력

<p>There will be multiple test cases. Each test case will consist of an integer n (&le; 50) indicating the number of target positions to follow. A value of n = 0 indicates end of input. There will follow n integer triples, x y h, indicating a balloon at position (x,y) in the field at height h. (There will be at most one balloon at any position (x,y).) All integers are greater than 0 and no greater than 100. Furthermore assume that the shooter can take shots from anywhere on the field at any height. For simplification, assume here that the balloons are points and that the bullets can pass through the poles on which the balloons are perched.</p>

### 출력

<p>Each test case should produce one line of output of the form:</p>

<p>Target set k can be cleared using only s shots.</p>

<p>where k is the number of the test case, starting at 1, and the value of s is the minimum number of shots needed to hit all the targets in the set.</p>