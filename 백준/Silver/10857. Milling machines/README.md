# [Silver III] Milling machines - 10857

[문제 링크](https://www.acmicpc.net/problem/10857)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 115, 정답: 79, 맞힌 사람: 74, 정답 비율: 67.273%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>A fab lab is an open, small-scale workshop where you can create or fabricate almost anything you want mostly by using computer controlled tools like a laser cutter or a 3D printer. The FAU fab lab recently got a CNC milling machine. Using the milling machine you can cut or remove material with different tools from the surface of a workpiece. It is controlled via a computer program.</p>

<p>I sometimes wondered what happens if multiple different shaped workpieces are sent through the same milling program. For simplification assume that we have only two dimensional workpieces without holes. A milling program consists of multiple steps; each step describes where the milling machine has to remove material (using different tools) from the top of the surface.</p>

### 입력

<p>The first line consists of two integers W and S, where W gives the number of workpieces and S the number of steps in the milling program (1 &le; W, S &le; 10<sup>4</sup>). The next line consists of two integers X and Y , where X gives the width and Y gives the maximal possible height of workpieces (1 &le; X, Y &le; 100).</p>

<p>Then follow W lines, each describing one workpiece. Each workpiece description consists of X non-negative integers specifying the surface height in that column.</p>

<p>Then follow S lines, each describing one milling step of the milling progam. Each milling step description consists of X non-negative integers s<sub>i</sub> (0 &le; s<sub>i</sub> &le; Y ) specifying the amount of surface to cut off in each column (relative to the height of the milling area, i.e. Y , not relative to the top of the workpiece). See Fig. I.1 for details.</p>

### 출력

<p>For each workpiece, output one line containing X integers specifying the remaining surface heights (in the same order as in the input).</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/10857.%E2%80%85Milling%E2%80%85machines/029d3483.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/10857/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:119px; width:289px" /></p>

<p>Figure I.1: Second workpiece in first sample: initial workpiece followed by milling in each column &ndash; the value in the milling program determines the vertical position of the cutter head.</p>