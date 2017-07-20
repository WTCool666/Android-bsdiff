LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE    :=client_patch
LOCAL_SRC_FILES :=\
                  bspatch.c\
                  
#liblog.so libGLESv2.so
LOCAL_LDLIBS += -llog
include $(BUILD_SHARED_LIBRARY)