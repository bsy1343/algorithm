# [Platinum V] Split Windows - 4653

[문제 링크](https://www.acmicpc.net/problem/4653)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 6, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

구현, 파싱, 재귀, 문자열, 트리

### 문제 설명

<p>The Dotty Software Company makes software that is displayed on inexpensive text based terminals. One application for this system has a main window that can be subdivided into further subwindows. Your task is to take a description of the screen layout after a sequence of window splits and draw the minimum sized window grid that is consistent with the description.</p>

<p>In this problem we will concentrate on the boundaries of windows, so all the characters inside of windows will be left blank. Each window that is not further subdivided has a label. Each label is a distinct uppercase letter. For a text terminal the boundaries of windows must be drawn with characters, chosen as follows: A capital letter label is placed in the upper left-hand corner of each undivided window. &nbsp;Asterisks,&#39;*&#39;, appear in corners of windows where there is not a label. Dashes, &#39;-&#39;, appear on upper and lower boundaries where there are not corners. Vertical bars, &#39;|&#39;, appear on side boundaries where there are not corners.</p>

<p>For example, the sequence of splits below would generate Window 1: Initially there could be an application window labeled M, that is split next into left and right subwindows, adding label R, and the left subwindow is split into top and bottom subwindows, adding the label C.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/4653/4653-1.gif" /></p>

<p>For each pattern of splits there is a binary tree of characters that can describe it. &nbsp;The window splitting and tree structures are described together, building up from the simplest cases.</p>

<p>A window may be an undivided rectangle. &nbsp;Such a window has a capital letter as label. &nbsp;The tree for the window contains just the label.<br />
A window may either be split into left and right subwindows or into top and bottom subwindows, and the corresponding trees have as root the boundary character for the split: a vertical line &#39;|&#39; or a horizontal dash &#39;-&#39; respectively. &nbsp;The root has left and right subtrees corresponding to the top and bottom or left and right subwindows respectively.</p>

<p>Tree 1, above, and Trees 2-4, below, would be consistent with Windows 1-4. &nbsp;Note that Tree 4 contains Trees 2 and 3.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/4653/wt23.gif" style="height:211px; width:482px" /></p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/4653/wt4.gif" style="height:195px; width:465px" /></p>

<p>The trees may be more succinctly expressed via a preorder traversal:</p>

<p>The preorder traversal of a tree with just one node (containing a letter) is that letter.<br />
The preorder traversal of a tree with a left and a right subtree is the character from the root of the tree (&#39;-&#39; or &#39;|&#39;) followed by the preorder traversal of the left subtree, and then the preorder traversal of the right subtree.</p>

<p>The preorder traversals for Trees 1 through 4 are&nbsp;</p>

<p>&nbsp; &nbsp;|-MCR &nbsp; &nbsp;-|-ABC-D|E-FG &nbsp; -P-|Q|RST &nbsp; &nbsp;|-|-ABC-D|E-FG-P-|Q|RST</p>

<p>Each undivided window must have space for at least one character inside. Hence each tree of splits will be associated with a minimum window size. &nbsp;Windows 1-4 are minimum sized windows for Trees 1-4. &nbsp;Each window illustrates the fact that even in a minimum sized window, not all undivided windows contain only one character.</p>

<p>Consider Tree 4 and Window 4. The main window is split into a left window with Tree 2 and right window with Tree 3. The left window is like Window 2, but the right window is not just like Window 3. &nbsp;The heights of left and right subwindows must match, so the right window must be stretched.</p>

<p>The stretching rule depends on a definition of the size of windows. &nbsp;For dimension calculations it is easiest to imagine that a window contains its interior and a half character wide boundary on all sides, so the total dimensions of a window are one more than the dimensions of the interior. &nbsp; Hence the minimum dimensions of a window are 2 by 2, since a window must contain one character inside, and we add one for the boundary. &nbsp;This definition also means that the sum of the widths of left and right subwindows is the width of their enclosing window. &nbsp;The sum of the heights of top and bottom subwindows is the height of their enclosing window.</p>

<p>The right window in Window 4 must be stretched to match the height 10 of the left window. &nbsp;The right window is split into a top with tree P having minimum height 2 and a bottom with tree -|Q|RST having minimum height 4. &nbsp;The rule for the dimensions in the stretched window is that the heights of the subwindows expand in proportion to their minimum heights, if possible. &nbsp;Some symbols may help here: &nbsp;Let D = 10 be the height of the combined stretched window. &nbsp;We want to determine D<sub>1</sub> and D<sub>2</sub>, the stretched heights of the top and bottom subwindow. &nbsp;Call the corresponding minimum dimensions d = 6, d<sub>1</sub> = 2, and d<sub>2</sub> = 4. &nbsp;If the window were expanded from a total height d to D in proportion, we would have D<sub>1</sub> = d<sub>1</sub>*(D/d) = 2*(10/6) = 3.333...and D<sub>2</sub> = d<sub>2</sub>*(D/d) = 6.666.... &nbsp; Since the results are not integers we increase D<sub>1</sub> to 4 and decrease D<sub>2</sub> to 6.</p>

<p>There is a similar calculation for the bottom window with tree -|Q|RST. &nbsp;It is further subdivided into a top with tree |Q|RS and a bottom with tree T, each having minimum height 2 = d<sub>1</sub> = d<sub>2</sub>. &nbsp;The heights need to add up to D = 6, so they are increased proportionally to D<sub>1</sub> = D<sub>2</sub> = 2*(6/4) = 3 (exact integers).</p>

<p>The final dimensions of an enclosing window are always determined before the final dimensions of its subwindows. &nbsp;In this example only heights needed to be apportioned. &nbsp;If all horizontal and vertical splits were interchanged in this example, producing a tree &nbsp;-|-|ABC|D-E|FG|P|-Q-RST, then widths would be apportioned correspondingly, as shown in the third part of the sample output below. &nbsp;If the proportion calculations do not work out to integers, it is always the top or left subwindow whose dimension is increased to the next integer.</p>

### 입력

<p>The first line of input contains one integer, which is the total number of preorder traversals describing window structures. &nbsp;This line is followed by one line for each preorder traversal. &nbsp;Each preorder traversal will contain appropriate dividers &#39;|&#39; and &#39;-&#39; and from 1 to 26 uppercase letters.</p>

### 출력

<p>For each preorder traversal, print the number of the preorder traversal on one line followed by the minimum sized window grid that the traversal could represent. &nbsp;Contrary to the general contest output conventions, there may be more than one consecutive blank in this output, but the other general rules for contest output are followed. &nbsp;The total number of rows or columns in output grids will be no more than 53.</p>