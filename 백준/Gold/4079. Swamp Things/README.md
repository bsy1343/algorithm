# [Gold III] Swamp Things - 4079

[문제 링크](https://www.acmicpc.net/problem/4079)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 41, 정답: 17, 맞힌 사람: 11, 정답 비율: 33.333%

### 분류

수학, 자료 구조, 기하학, 집합과 맵, 조합론

### 문제 설명

<p>Hugh F. Oh, in his never-ending quest to prove the existence of extraterrestrials, has gotten hold of a number of nighttime photographs taken by a research group that is examining glowing swamp gas. Hugh wants to see if any of the photos show, not swamp gas, but Little Grey Men in glowing suits. The photographs consist of bright dots appearing against a black background. Unfortunately, at the time the photos were taken, trains were travelling through the area (there is a train trestle over the swamp), and occasional lights from the train windows also appear in the photographs. Hugh, being a fastidious researcher, wants to eliminate these spots from the images. He can&rsquo;t tell from the photos exactly where the tracks are, or from what direction the photos were taken, but he knows that the tracks in that area are perfectly straight, so he&rsquo;s decided on the following approach: he will find the line with the maximum number of spots lying on it and, if there are four or more spots on the line, he will eliminate those points from his calculations, assuming that those are windows on the train. If two or more lines have the maximum number of points, Hugh will just randomly select one such set and delete it from the photo (he&rsquo;s not all that fastidious &ndash; after all, he believes in Little Grey Men). If there are fewer than four points lying along a common line, Hugh will assume that there is no train in the photograph and won&rsquo;t delete any points. Please write a program for him to process a set of photographs.</p>

### 입력

<p>There will be a series of test cases. Each test case is one photograph described by a line containing a positive integer n (&le; 1000), the number of distinct spots in the photograph, followed by n lines containing the integer coordinates of the spots, one (x,y) pair per line. All coordinates are between 0 and 10000. The last photo description is followed by a line containing a zero, marking the end of the input. This line should not be processed.&nbsp;</p>

### 출력

<p>For each test case, output the photo number followed by the number of points eliminated from the photograph. Imitate the sample output below.</p>