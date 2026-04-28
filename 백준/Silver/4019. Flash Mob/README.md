# [Silver II] Flash Mob - 4019

[문제 링크](https://www.acmicpc.net/problem/4019)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 89, 정답: 42, 맞힌 사람: 34, 정답 비율: 47.887%

### 분류

수학, 정렬

### 문제 설명

<p>Jumping Jack is in charge of organizing a flash mob. The members of the flash mob move around town all day and part of the appeal of this group is they come together to do their thing whenever the mood strikes Jack. When the mood does strike, Jack sends a text message to the members to meet at a particular intersection in town in exactly one hour. The streets of the town run only north-south or east-west and are evenly spaced, forming a perfect grid like a sheet of graph paper. Due to the spontaneity, Jack wants to minimize the inconvenience and so picks an intersection to minimize the total distance traveled by the flash mob&rsquo;s members. Fortunately Jack has the locations of all the members via the GPS on their cell phones. Your job is to find the meeting location given all the members&rsquo; locations.</p>

<p>Each intersection will be given by a pair of non-negative integers; the first coordinate is the east-west street and the second coordinate is the north-south street. The location of each flash mob member will be an intersection. Members can travel only north-south or east-west between intersections.</p>

<p>For example, suppose there are 5 mob members at locations (3, 4),(0, 5),(1, 1),(5, 5), and (5, 5). Then if Jack summons them all to location (3, 5), the total number of blocks traveled by the mob members would be 14. Jack could do no better &ndash; but sometimes the &lsquo;best&rsquo; location may not be unique.</p>

### 입력

<p>Input for each test case will be a series of integers on one or more lines. The first integer, n (1 &le; n &le; 1000), indicates the number of mob members. There follow n pairs of integers indicating the location (intersection) of each member. The location coordinates are both between 0 and 10<sup>6</sup>, inclusive. More than one member may be at the same intersection. A line containing 0 will follow the last test case.</p>

### 출력

<p>Output one line for each test case in the format given below. The ordered pair is the coordinates of the location in the city where the total distance traveled (in blocks) is minimal. If there is more than one such location, output the one with the smallest first coordinate. If there is more than one &lsquo;best&rsquo; location with the smallest first coordinate, output the one of those with the smallest second coordinate. The total number of blocks traveled by all the mob members follows the location.</p>