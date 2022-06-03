# DragonflyORS_Segmentations
Python code to fill humeral head cysts with openings smaller than 200 microns, and then erode 2.5 mm from the filled ROI.

Kernel = 5

Fill ROI:
  dilate 20,
  3D fill,
  erode 20

Erode 2.5 mm:
  erode 50
