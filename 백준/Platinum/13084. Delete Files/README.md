# [Platinum IV] Delete Files - 13084

[문제 링크](https://www.acmicpc.net/problem/13084)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 95, 정답: 25, 맞힌 사람: 23, 정답 비율: 31.507%

### 분류

애드 혹, 그리디 알고리즘

### 문제 설명

<p>You are using an operating system named &quot;Jaguntu&quot;. Jaguntu provides &quot;Filer&quot;, a file manager with a graphical user interface.</p>

<p>When you open a folder with Filer, the name list of files in the folder is displayed on a Filer window. Each filename is displayed within a rectangular region, and this region is called a filename region. Each filename region is aligned to the left side of the Filer window. The height of each filename region is 1, and the width of each filename region is the filename length. For example, when three files &quot;acm.in1&quot;, &quot;acm.c~&quot;, and &quot;acm.c&quot; are stored in this order in a folder, it looks like Fig.C-1 on the Filer window.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13084.%E2%80%85Delete%E2%80%85Files/ab0c0564.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/13084.%E2%80%85Delete%E2%80%85Files/ab0c0564.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13084/figC1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:154px; width:300px" /></p>

<p>Fig.C-1</p>

<p>You can delete files by taking the following steps. First, you select a rectangular region with dragging a mouse. This region is called selection region. Next, you press the delete key on your keyboard. A file is deleted if and only if its filename region intersects with the selection region. After the deletion, Filer shifts each filename region to the upside on the Filer window not to leave any top margin on any remaining filename region. For example, if you select a region like Fig.C-2, then the two files &quot;acm.in1&quot; and &quot;acm.c~&quot; are deleted, and the remaining file &quot;acm.c&quot; is displayed on the top of the Filer window as Fig.C-3.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13084.%E2%80%85Delete%E2%80%85Files/144e8c16.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/13084.%E2%80%85Delete%E2%80%85Files/144e8c16.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13084/figC2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:153px; width:300px" /></p>

<p>Fig.C-2</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13084.%E2%80%85Delete%E2%80%85Files/2d73fd85.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/13084.%E2%80%85Delete%E2%80%85Files/2d73fd85.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13084/figC3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:153px; width:300px" /></p>

<p>Fig.C-3</p>

<p>You are opening a folder storing NN files with Filer. Since you have almost run out of disk space, you want to delete unnecessary files in the folder. Your task is to write a program that calculates the minimum number of times to perform deletion operation described above.</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

### 입력

<p>The input consists of a single test case. The test case is formatted as follows.</p>

<pre>
N
D<sub>1</sub> L<sub>1</sub>
D<sub>2</sub> L<sub>2</sub>
...
D<sub>N</sub> L<sub>N</sub></pre>

<p><br />
The first line contains one integer N (1 &le; N &le; 1,000), which is the number of files in a folder. Each of the next N lines contains a character D<sub>i</sub> and an integer L<sub>i</sub>: D<sub>i</sub> indicates whether the i-th file should be deleted or not, and L<sub>i</sub> (1 &le; L<sub>i&nbsp;</sub>&le; 1,000) is the filename length of the i-th file. If D<sub>i</sub> is &#39;y&#39;, the i-th file should be deleted. Otherwise, D<sub>i</sub> is always &#39;n&#39;, and you should not delete the i-th file.</p>

### 출력

<p>Output the minimum number of deletion operations to delete only all the unnecessary files.</p>