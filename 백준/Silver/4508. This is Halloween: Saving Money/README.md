# [Silver IV] This is Halloween: Saving Money - 4508

[문제 링크](https://www.acmicpc.net/problem/4508)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 65, 정답: 40, 맞힌 사람: 24, 정답 비율: 60.000%

### 분류

수학, 문자열, 기하학, 파싱

### 문제 설명

<p>The Mayor of Halloween Town was always concerned about saving money. When the Pumpkin King, Jack Skelington decided to try his hand at stealing Christmas again, the mayor began trying to cut corners wherever he could to afford it. They were in a recession, after all! When the great Jack commanded him to order enough wrapping paper for all the presents, the Mayor wanted to make sure he would only the absolute minimum amount. In order to do that, he has asked you, the local computer ghoul to write a problem to calculate the amount of wrapping paper that each of the different types of gifts would take. Thankfully for you, all of the gifts are able to fit in different sizes of rectangular boxes (The vampire trio, who is in charge of presents this year, got their start in manufacturing things while interns at Ikea). Each present can be represented by a name, and the three dimensions of the box <code>a</code>, <code>b</code>, <code>c</code> (<code>0 &lt; a &lt;= b &lt;= c</code>) in frightometers.</p>

<p><img alt="box showing three sides" src="%EB%B0%B1%EC%A4%80/Silver/4508.%E2%80%85This%E2%80%85is%E2%80%85Halloween%3A%E2%80%85Saving%E2%80%85Money/64c57159.gif" data-original-src="https://www.acmicpc.net/upload/images2/box-three-overlaps.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>The procedure for wrapping the gift is first, a large sheet of wrapping paper is laid on a flat surface. Then, the box is placed on the wrapping paper with one of its &#39;<code>bc</code>&#39; faces resting on the wrapping paper. The wrapping paper is folded around the four &#39;<code>c</code>&#39; edges and the excess is cut off, leaving a 3 frightometer wide overlap on one of the &#39;<code>ac</code>&#39; faces (shown shaded in the figure). At this point, the wrapping paper has the form of a long rectangular tube.</p>

<p>Now more wrapping paper is cut off at the two ends of the tube. It is cut flush with the &#39;<code>a</code>&#39; edges. Along the &#39;<code>b</code>&#39; edges, rectangular flaps remain. These rectangular flaps are cut so that when they are folded along the &#39;<code>b</code>&#39; edges, they cover the two &#39;<code>ab</code>&#39; faces with a 3 frightometer wide overlap (overlapping areas shown shaded in the figure). The excess paper can be recycled (The Shadow on the Moon at night is an accomplished paper maker!), so that isn&#39;t to be taken into account. Calculate the amount of paper, in square frightometers that each box needs in order to be properly wrapped.</p>

### 입력

<p>Input will begin with a single line containing a single integer, <code>n &gt; 0</code>, where <code>n</code> is the number types of boxes you need to process. The following <code>n</code> lines start with the name of a product, in single quotes followed by three integers, <code>a</code>, <code>b</code> and <code>c</code> which represent the three dimensions of the package, as illustrated in the picture above. Following the dimensions, a number of significant digits to include in the answer. The number of significant digits will never be greater than the number of digits in the answer. None of the dimensions will be greater than 10,000.</p>

### 출력

<p>Output will consist of <code>n</code> lines of the form: <code>&quot;&lt;Present Name&gt; requires &lt;total paper area&gt; square frightometers of paper to wrap&quot;</code></p>