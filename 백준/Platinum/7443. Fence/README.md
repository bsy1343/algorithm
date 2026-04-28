# [Platinum III] Fence - 7443

[문제 링크](https://www.acmicpc.net/problem/7443)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 5, 맞힌 사람: 4, 정답 비율: 44.444%

### 분류

수학, 기하학, 미적분학, 물리학

### 문제 설명

<p>There is an area bounded by a fence on some flat field. The fence has the height \(h\)and in the plane projection it has a form of a closed polygonal line (without self-intersections), which is specified by Cartesian coordinates (\(X_i\), \(Y_i\)) of its \(N\) vertices. At the point with coordinates (0, 0) a lamp stands on the field. The lamp may be located either outside or inside the fence, but not on its side as it is shown in the following sample pictures (parts shown in a thin line are not illuminated by the lamp):&nbsp;</p>

<p><img alt="" src="/upload/images2/fence1.png" style="height:82px; width:121px" /></p>

<p>The lamp is inside the fence</p>

<p><img alt="" src="/upload/images2/fence2.png" style="height:128px; width:93px" /></p>

<p>The lamp is outside the fence</p>

<p>The fence is perfectly black, i.e. it is neither reflecting, nor diffusing, nor letting the light through. Research and experiments showed that the following law expresses the intensity of light falling on an arbitrary illuminated point of this fence:&nbsp;</p>

<p>\[I_0 = k/r \]</p>

<p>where \(k\) is a known constant value not depending on the point in question, \(r\) is the distance between this point and the lamp inthe plane projection. The illumination of an infinitesimal narrow vertical board with the width \(dl\) and the height \(h\) is&nbsp;</p>

<p>\[dI = I_0 &nbsp; \cdot \left| \cos { \alpha } &nbsp;\right| &nbsp;\cdot dl \cdot h\]</p>

<p>where \(I_0\) is the intensity of light on that board of the fence, \(\alpha\) is the angle in the plane projection between the normal to the side of the fence at this point and the direction to the lamp.&nbsp;</p>

<p>You are to write a program that will find the total illumination of the fence that is defined as the sum of illuminations of all its illuminated boards.&nbsp;</p>

### 입력

<p>The first line of the input file contains the numbers \(k\), \(h\) and \(N\), separated by spaces. \(k\) and \(h\) are real constants. \(N\) (3 &le; \(N\) &le; 100) is the number of vertices of the fence. Then \(N\) lines follow, every line contains two real numbers \(X_i\) and \(Y_i\), separated by a space.&nbsp;</p>

### 출력

<p>Write to the output file the total illumination of the fence rounded to the second digit after the decimal point.&nbsp;</p>