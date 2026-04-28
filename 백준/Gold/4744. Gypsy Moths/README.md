# [Gold IV] Gypsy Moths - 4744

[문제 링크](https://www.acmicpc.net/problem/4744)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 8, 맞힌 사람: 7, 정답 비율: 50.000%

### 분류

브루트포스 알고리즘, 기하학, 두 포인터

### 문제 설명

<p>&ldquo;The number of infestations is getting worse&rdquo;, said the Ranger. &ldquo;If we don&rsquo;t get those moths under control, there won&rsquo;t be a healthy tree left in the whole park. Let me show you.&rdquo;</p>

<p>He spread out a map, liberally decorated with red X&rsquo;s. &ldquo;With our remote-control camera atop Mount Hiabove, we can easily spot the infested trees. Each mark on this map shows an infested site.&rdquo;</p>

<p>&ldquo;Well&rdquo;, said the Park Manager, &ldquo;we have a congressional delegation visiting tomorrow. I don&rsquo;t think they&rsquo;ll be impressed by a map, but if we could show them the feed from that camera as it pans around...&rdquo;</p>

<p>&ldquo;That&rsquo;s a problem&rdquo;, said the Ranger. &ldquo;The temperature on the mountain is dropping. By the time they get here, the camera will probably be frozen in place. We better not assume we&rsquo;ll be able to move the camera. And, remember, it doesn&rsquo;t have a very wide field of view. It only shows a rather narrow angle.&rdquo;</p>

<p>&rdquo;We&rsquo;ll have to do the best we can&rdquo;, said the Manager. &rdquo;Let&rsquo;s point the camera right now in the direction that will show the most infested trees. Let&rsquo;s see. . . &rdquo;. He began to study the map.</p>

### 입력

<p>Input consists of one or more data sets.</p>

<p>In each data set, line 1 contains the non-negative number N of infested trees. A value of 0 indicates end of input.</p>

<p>For each data set, line 2 contains the X,Y coordinates of the camera and the field of view of the camera. Lines 3 . . . N + 2 each contain the X,Y coordinates of an infested tree. None of these will be the same as the coordinates of the camera;</p>

<p>Coordinates are given as floating point numbers in the range &minus;500.0 . . . 500.0. The field of view is given as a floating-point angle, in degrees, in the range 0.1 . . . 179.9.</p>

### 출력

<p>Determine the angle A that maximizes the number of infested trees visible within the angular range A &plusmn; V/2 where V is the angular field of view of the camera. The camera positioning system is calibrated in tenths of a degree and &ldquo;clicks&rdquo; into place at each tenth of a degree &ndash; intermediate values are not possible. A tree is considered &ldquo;visible&rdquo; if it lies inside the A &plusmn; V /2 - trees that lie exactly on the border are not considered visible(For contest purposes, judging data will not rely upon calculations resolving trees&rsquo; locations to within a finer precision than the closest 0.01 degree.).</p>

<p>The angle 0.0 corresponds to the positive Y axis and the angle 90.0 corresponds to the positive X axis. Assume that distance is not a factor in the visibility of trees.</p>

<p>If more than one angle allows viewing of the same maximal number of infestations, choose the smallest such angle.</p>

<p>For each input set, produce a single line of output of the form:</p>

<p>Point the camera at angle ### to view ## infested trees.</p>

<p>The angle should be printed in degrees in the range 0.0 . . . 359.9 with one digit after the decimal. The number of visible infested trees should be printed as an integer.</p>