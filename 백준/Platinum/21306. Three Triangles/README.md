# [Platinum III] Three Triangles - 21306

[문제 링크](https://www.acmicpc.net/problem/21306)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 12, 맞힌 사람: 12, 정답 비율: 80.000%

### 분류

기하학, 수학

### 문제 설명

<p>Starting with a <strong>△ABC</strong> with vertices <strong>A</strong>, <strong>B</strong>, <strong>C</strong> and sides <strong>a</strong>, <strong>b</strong>, <strong>c</strong> opposite <strong>A</strong>, <strong>B</strong>, <strong>C</strong>, respectively:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/6d8e1d31-141c-4d08-9e34-b639dea920f9/-/preview/" style="width: 164px; height: 140px;" /></p>

<p>Construct the altitudes <strong>ha</strong>, <strong>hb</strong> and <strong>hc</strong> to sides <strong>a</strong>, <strong>b</strong>, <strong>c</strong> respectively (red) and the perpendicular bisectors <strong>pa</strong>, <strong>pb</strong> and <strong>pc</strong> to sides <strong>a</strong>, <strong>b</strong>, <strong>c</strong> (green):</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/9e7e5a1e-d39b-4fb9-8480-da865b76f1fe/-/preview/" style="width: 231px; height: 282px;" /></p>

<p>Let <strong>A&rsquo;</strong> = <strong>hc</strong> intersect <strong>pb</strong>, <strong>B&rsquo;</strong> = <strong>ha</strong> intersect <strong>pc</strong> and <strong>C&rsquo;</strong> = <strong>hb</strong> intersect <strong>pa</strong> yeilding a new <strong>△A&rsquo;B&rsquo;C&rsquo;</strong> similar to <strong>ABC</strong> as shown on the below.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/11926b42-1080-41e1-8166-8a55fb912fa0/-/preview/" style="width: 243px; height: 303px;" /></p>

<p>Finally, let <strong>A&rsquo;&rsquo;</strong> = reflection of <strong>A&rsquo;</strong> in side <strong>b</strong>, <strong>B&rsquo;&rsquo;</strong> = reflection of <strong>B&rsquo;</strong> in side <strong>c</strong> and <strong>C&rsquo;&rsquo;</strong> = reflection of <strong>C&rsquo;</strong> in side <strong>a</strong> to obtain yet another similar triangle:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/0393d691-ed24-44b3-a686-78bc71d69e28/-/preview/" style="width: 243px; height: 303px;" /></p>

<p>Write a program which takes as input the coordinates of the vertices <strong>A</strong>, <strong>B</strong> and <strong>C</strong> and outputs the areas of the three triangles.</p>

### 입력

<p>Input consists of a single line which contains three, space separated floating point values <em><strong>Bx</strong></em>, <em><strong>Cx</strong></em>, <em><strong>Cy</strong></em> in that order (-1.0 &le; <strong><em>Bx</em></strong>, <em><strong>Cx</strong></em>, <em><strong>Cy</strong></em> &le; 10.0). <strong>△ABC</strong> will have area at least <strong>1.0</strong>. The coordinates system is chosen so that <strong>A</strong> = (<strong>0</strong>, <strong>0</strong>) is the origin and <strong>B</strong> = (<em><strong>Bx</strong></em>, <strong>0</strong>) lies on the <strong>X</strong>-axis. <strong>C</strong> = (<em><strong>Cx</strong></em>, <em><strong>Cy</strong></em>) is arbitrary.</p>

### 출력

<p>The output consists of a single line that contains three space separated floating point values to 4 decimal places. Area(<strong>△ABC</strong>), Area(<strong>△A&rsquo;B&rsquo;C&rsquo;</strong>) and Area(<strong>△A&rdquo;B&rdquo;C&rdquo;</strong>) in that order.</p>