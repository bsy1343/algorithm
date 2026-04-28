# [Platinum II] Equinox Roller Coaster - 14980

[문제 링크](https://www.acmicpc.net/problem/14980)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 86, 정답: 14, 맞힌 사람: 10, 정답 비율: 14.085%

### 분류

자료 구조, 브루트포스 알고리즘, 정렬, 집합과 맵, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵, 제곱근 분할법

### 문제 설명

<p>Equiroaster is an abbreviation of EQUInox ROller coASTER, a new and grand attraction which is going to be built in the park vicinity the next year.</p>

<p>The name of the roller coaster comes from the fact that it is the first roller coaster of its class with a construction and shape directly linked to major astronomical events. Twice a year, at equinox, the visitors will enjoy an unforgettable ride enhanced by additional visual effects. Also, the advertising value of equinox rides is expected to be very high.</p>

<p>To meet the expectations, Equiroaster must be built very precisely. The alignment of its tracks with East-West direction must be precise. The tracks will be supported by four main piers and the alignment of the Southern and the Northern pair of piers with East-West direction must be equally precise.</p>

<p>Equiroaster will be built in the field close to other park attractions. The field geology is suspected to be somewhat less favorable to large building projects and thus a detailed survey of the field was commissioned. A grid perfectly aligned with East-West direction (or equivalently, with North-South direction) and with grid points one meter apart was projected onto the field. Each grid point was geologically evaluated and marked as stable or unstable.</p>

<p>All four main piers of Equiroaster must be built on stable grid points. It is hoped that there are enough stable grid points in the field to allow for a really extensive design of the coaster. However, the building technology dictates that the base of the four main piers must form a perfect square in order to reliably support the massive weight of the coaster.</p>

<p>The task is to determine the maximum possible distance between the piers on one side of the coaster according to the specifications described above.</p>

### 입력

<p>There are more test cases. Each case starts with a line containing one integer N specifying the number of stable grid points (1 &le; N &le; 100 000). Next, there are N lines each of which specifies x- and y-coordinates of a grid point. You should suppose that the grid axes are aligned with East-West and with South-North directions and also that the coordinates are given in whole meters. All grid points in one test case are unique. The absolute value of each coordinate is at most 10<sup>9</sup>.</p>

### 출력

<p>For each test case, print a single line with one integer denoting the maximum possible distance in meters between the centers of two piers on one side of the coaster. If it is not possible to place the piers on stable grid points according to the specifications, print 0 on the output line.</p>