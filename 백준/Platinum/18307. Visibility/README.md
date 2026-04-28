# [Platinum IV] Visibility - 18307

[문제 링크](https://www.acmicpc.net/problem/18307)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 15, 맞힌 사람: 15, 정답 비율: 68.182%

### 분류

자료 구조, 세그먼트 트리, 스위핑, 값 / 좌표 압축

### 문제 설명

<p>In the Regional Park of the Haute Vall&eacute;e de Chevreuse, N observation houses have been built, for the purpose of watching and counting local animals. Furthermore, to help animals and tourists move more efficiently, paths were built along the axes of a grid: these paths are all along the straight vertical (i.e., along a North&ndash;South axis) and horizontal (i.e., along an West&ndash;East axis) lines.</p>

<p>Every house has a wide observation window that is oriented towards the South. This window allows people to see in every direction that is within a 60<sup>◦</sup> angle with the South &ndash; thereby covering a third of the plane &ndash; which offers a beautiful show in the spring and summer seasons. However, during winter, the animals stay home or migrate to warmer countries, and the trees have lost their leaves and become so thin that they are barely visible, so the only things that people can see and count are the other observation houses.</p>

<p>Yet, this is still a fun excursion in the wild for the days after SWERC. A group of N students have decided to go to the Regional Park. You are helping them with the planning, having the coordinates of every house. Each student is going to one of the houses.</p>

<p>Once arrived, each participant plans to stand at the observation window of her own house, and to take a picture of every other house she can see from that spot. After the excursion, you will have to gather all the pictures that the students have taken.</p>

<p>Given the list of coordinates of the observation houses, how many pictures will you gather?</p>

### 입력

<p>The input consists of the following lines:</p>

<ul>
	<li>The first line contains the number N of students, which is also the number of observation houses, an integer;</li>
	<li>For all i such that 0 &le; i &lt; N, line i + 2 contains the coordinates X<sub>i</sub> and Y<sub>i</sub> of the i<sup>th</sup> observation house, separated by a space.</li>
</ul>

### 출력

<p>Your output should contain a single line with a single integer equal to the total number of pictures that will be taken.</p>

### 제한

<ul>
	<li>2 &le; N &le; 100 000;</li>
	<li>0 &le; X<sub>i</sub> &le; 100 000 and 0 &le; Y<sub>i</sub> &le; 100 000 for all i.</li>
</ul>

### 힌트

<p>If a house Y lies on the border of the third of plane visible from another house X, the participant who went to house X will not take a picture of Y, as this picture would only be partial. If a house Z lies on the segment [X,Y] when Y is visible from X, then the participant who went to house X will take one picture focusing only on the house Y, and another picture focusing only on the house Z.</p>